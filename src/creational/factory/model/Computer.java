package creational.factory.model;

public abstract class Computer {
    public abstract String getCPU();
    public abstract String getRAM();
    public abstract String getHDD();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }

}
