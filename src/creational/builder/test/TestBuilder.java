package creational.builder.test;

import creational.builder.model.Computer;

public class TestBuilder {
    public static void  main(String[] args){
        Computer computer1 = new Computer.ComputerBuilder("2GB","1TO").setBluetoothEnabled(true).setGraphicsCardEnabled(false).build();
        System.out.println("Computer 1 " + computer1.toString());

        Computer computer2 = new Computer.ComputerBuilder("3GB","4TO").setBluetoothEnabled(true).build();
        System.out.println("Computer 2 " + computer2.toString());

        Computer computer3 = new Computer.ComputerBuilder("2GB","1TO").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.println("Computer 3 " + computer3.toString());

        Computer computer4 = new Computer.ComputerBuilder("2GB","1TO").build();
        System.out.println("Computer 4 " + computer4.toString());
    }
}
