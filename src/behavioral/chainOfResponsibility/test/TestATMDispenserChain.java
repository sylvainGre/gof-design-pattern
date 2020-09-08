package behavioral.chainOfResponsibility.test;

import behavioral.chainOfResponsibility.impl.Dollar10Dispenser;
import behavioral.chainOfResponsibility.impl.Dollar20Dispenser;
import behavioral.chainOfResponsibility.impl.Dollar50Dispenser;
import behavioral.chainOfResponsibility.model.Currency;
import behavioral.chainOfResponsibility.model.DispenseChain;

import java.util.Scanner;

public class TestATMDispenserChain {

    private DispenseChain dispenseChain;

    public TestATMDispenserChain(){
        this.dispenseChain = new Dollar50Dispenser();
        DispenseChain dispenseChain20 = new Dollar20Dispenser();
        this.dispenseChain.setNextChain(dispenseChain20);

        DispenseChain dispenseChain10 = new Dollar10Dispenser();
        dispenseChain20.setNextChain(dispenseChain10);
    }

    public static void main(String[] args){
        TestATMDispenserChain testATMDispenserChain = new TestATMDispenserChain();
        while (true){
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if(amount % 10 != 0){
                System.out.println("Amount should be in multiple of 10");
            }
            testATMDispenserChain.dispenseChain.dispense(new Currency(amount));
        }
    }
}
