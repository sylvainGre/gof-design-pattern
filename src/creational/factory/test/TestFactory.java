package creational.factory.test;

import creational.factory.exception.ComputerTypeException;
import creational.factory.factory.ComputerFactory;
import creational.factory.factory.ComputerType;
import creational.factory.model.Computer;

public class TestFactory {

    public static void main(String[] args){
        try {
            Computer pc = ComputerFactory.getComputer("PC", "Intel","2gb","1To");
            Computer server = ComputerFactory.getComputer("Server","xeon","2gb", "6to");

            System.out.println("PC: " + pc.toString());
            System.out.println("Server : " +server.toString());
        } catch (ComputerTypeException e) {
            e.printStackTrace();
        }



    }
}
