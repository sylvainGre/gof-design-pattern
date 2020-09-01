package structural.flyweight.factory;

import structural.flyweight.model.Line;
import structural.flyweight.model.Oval;
import structural.flyweight.model.Shape;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType shapeType){
        Shape shape = shapes.get(shapeType);
        if(shape == null){
            switch (shapeType){
                case OVAL_FILL -> shape = new Oval(true);
                case OVAL_NOFILL -> shape= new Oval(false);
                case LINE -> shape = new Line();
            }
            shapes.put(shapeType, shape);
        }
        return shape;
    }
}
