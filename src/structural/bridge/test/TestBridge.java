package structural.bridge.test;

import structural.bridge.model.*;

public class TestBridge {
    public static void main(String[] args){
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
