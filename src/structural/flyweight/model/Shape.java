package structural.flyweight.model;

import java.awt.Graphics;
import java.awt.Color;

public interface Shape {
    void draw(Graphics graphics, int x, int y, int width, int height, Color color);
}
