package creational.abstractFactory.test;

import creational.abstractFactory.factory.ComputerFactory;
import creational.abstractFactory.factory.PCFactory;
import creational.abstractFactory.factory.ServerFactory;
import creational.abstractFactory.model.Computer;

public class TestAbstractFactory {

    public static void main(String[] args){
        Computer PC = ComputerFactory.getComputer(new PCFactory("Intel","4GB","3TO"));
        Computer Server = ComputerFactory.getComputer(new ServerFactory("AMD","60GB","100TO"));
        System.out.println(PC.toString());
        System.out.println(Server.toString());
    }
}
