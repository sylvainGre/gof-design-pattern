package structural.bridge.model;

public class GreenColor implements Color{

    public GreenColor() {

    }

    @Override
    public void applyColor() {
        System.out.println("green");
    }
}

