package structural.decorator.model;

public class SportCar  extends  CarDecorator{
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Adding feature of Sport car");
    }
}
