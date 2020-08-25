package creational.abstractFactory.factory;

import creational.abstractFactory.model.Pc;
import creational.abstractFactory.model.Computer;

public class PCFactory implements ComputerAbstractFactory{
    private String CPU;
    private String RAM;
    private String HDD;

    public PCFactory(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public Computer createComputer() {
        return new Pc(CPU,RAM,HDD);
    }
}
