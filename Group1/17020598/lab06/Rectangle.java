/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class Rectangle extends Shape{
    private double width, length;
    public Rectangle() {
    }

    public Rectangle(double width, double length, int x, int y, boolean filled, boolean visible, String color) {
        super(x, y, filled, visible, color);
        this.width = width;
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", x=" + x + ", y=" + y + ", filled=" + filled + ", visible=" + visible + ", color=" + color + '}';
    }
}
