package creational.abstractFactory.model;

public class Pc extends Computer{
    private String CPU;
    private String RAM;
    private String HDD;

    public Pc(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }
}
