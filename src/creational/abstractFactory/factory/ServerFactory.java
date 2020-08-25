package creational.abstractFactory.factory;

import creational.abstractFactory.model.Computer;
import creational.abstractFactory.model.Server;

public class ServerFactory implements ComputerAbstractFactory{

    private String CPU;
    private String RAM;
    private String HDD;

    public ServerFactory(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new Server(CPU,RAM, HDD);
    }
}
