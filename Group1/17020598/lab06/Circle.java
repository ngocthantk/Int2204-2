/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class Circle extends Shape{
     private double radius;

    public Circle() {
    }

    public Circle(double radius, int x, int y, boolean filled, boolean visible, String color) {
        super(x, y, filled, visible, color);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", x=" + x + ", y=" + y + ", filled=" + filled + ", visible=" + visible + ", color=" + color + '}';
    }
}
