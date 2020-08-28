package structural.composite.composite;

import structural.composite.model.Shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        this.shapes.forEach(shape -> shape.draw(fillColor));
    }

    public void add(Shape shape){
        this.shapes.add(shape);
    }

    public void remove(Shape shape){
        this.shapes.remove(shape);
    }

    public void clear(){
        this.shapes.clear();
        System.out.println("Clearing all the shapes from drawing");
    }
}
