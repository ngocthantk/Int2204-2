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
public class Circle extends Shape {
    final double PI = 3.1415;//pi nen de final
    protected double radius = 1.0;

    public Circle() {

    }

    ;
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;;
     
    }


    public double getRadius() {
        return radius;
    }
 

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return PI * this.radius * this.radius;
    }
  

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    public String toString() {
        return super.toString() + " " + this.getArea() + " " + this.getPerimeter();
    }
}
