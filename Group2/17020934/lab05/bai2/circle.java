/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba2;

/**
 *
 * @author tuann_000
 */
public class circle extends shape{
    public final double pi = 3.14;
    private double  radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public circle() {
    }
    public circle(double radius) {
        this.radius = radius;
    }
    public circle(double  radius, String color, boolean filled) {
       
        super(color, filled);
         this.radius = radius;
    }
    public double getArea(){
        return getRadius()*2*pi;
    }
    public double getPerimeter(){
        return getRadius()*getRadius()*pi;
    }
    @Override
    public String toString(){
        return this.getColor()+this.isFilled()+this.radius;
    }
}
