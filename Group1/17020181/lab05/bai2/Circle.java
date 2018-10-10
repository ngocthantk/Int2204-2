/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Ha
 */
public class Circle extends Shape { // hình tròn
    private double radius = 1.0; // bán kính hình tròn
    double pi = 3.14;
    public Circle() {
    }
    
    public Circle (double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() { // tính diện tích hình tròn
        double area  = pi*this.radius*this.radius;
        return area;
    }
    
    public double getPerimeter(){ // chu vi hình tròn
        double perimeter = this.radius*2*pi;
        return perimeter;
    }
}
