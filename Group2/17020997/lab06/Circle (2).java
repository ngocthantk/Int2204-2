/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dohoa;

/**
 *
 * @author MyPC
 */
public class Circle extends Shape{
    private double radius;
    public Circle(double r, boolean b){
        super(b);
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
