package creational.factory.factory;

import creational.factory.exception.ComputerTypeException;
import creational.factory.model.Computer;
import creational.factory.model.Pc;
import creational.factory.model.Server;

public class ComputerFactory {

    public static Computer getComputer(String type, String cpu, String ram, String hdd) throws ComputerTypeException{
        if(type.equalsIgnoreCase("PC")){
            return new Pc(cpu,ram, hdd);
        }
        else if(type.equalsIgnoreCase("Server")){
            return new Server(cpu, ram, hdd);
        }
        else
        {
            throw new ComputerTypeException("Computer type invalid");
        }
    }
}
