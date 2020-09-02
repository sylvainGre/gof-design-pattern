package structural.bridge.model;

public class RedColor implements Color{
    public RedColor() {

    }

    @Override
    public void applyColor() {
        System.out.println("red");
    }
}
