package structural.composite.test;

import structural.composite.composite.Drawing;
import structural.composite.model.Circle;
import structural.composite.model.Shape;
import structural.composite.model.Triangle;

public class TestComposite {
    public static void main(String[] args){
        Shape triangle = new Triangle();
        Shape cercle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(cercle);

        drawing.draw("red");
        drawing.clear();
        drawing.add(triangle);
        drawing.add(cercle);
        drawing.draw("blue");
    }
}
