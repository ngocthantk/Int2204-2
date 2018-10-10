/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author FEELSBADMAN
 */
public class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;

    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.length = length;
        this.width = width;
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

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter() {
        return 2 * (this.getWidth() + this.getLength());
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getArea() + " " + this.getPerimeter();
    }
}
