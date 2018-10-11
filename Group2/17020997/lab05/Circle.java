/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
/**
 *
 * @author MyPC
 */
public class Circle extends Shape{
    double radius = 1.0;
     double PI = 3.14;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String mau, boolean fill, double radius) {
        
        this.radius = radius;
        this.Colour = mau;
        this.filled = fill;
    }

    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getChuVi(){
        return 2*PI*radius;
    }
    
    
    
}
