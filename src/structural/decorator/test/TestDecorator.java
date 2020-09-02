package structural.decorator.test;

import structural.decorator.model.BasicCar;
import structural.decorator.model.Car;
import structural.decorator.model.LuxuryCar;
import structural.decorator.model.SportCar;

public class TestDecorator {
    public static void main(String[] args){
        Car sportCar= new SportCar(new BasicCar());
        sportCar.assemble();

        Car sportLuxuryCar = new LuxuryCar(new SportCar(new BasicCar()));
        sportLuxuryCar.assemble();

    }
}
