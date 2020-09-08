package behavioral.chainOfResponsibility.impl;

import behavioral.chainOfResponsibility.model.Currency;
import behavioral.chainOfResponsibility.model.DispenseChain;

public class Dollar50Dispenser  implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.dispenseChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50){
            int num = currency.getAmount()/50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.dispenseChain.dispense(new Currency(remainder));
        }else{
            this.dispenseChain.dispense(currency);
        }
    }
}
