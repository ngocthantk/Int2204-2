/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author tuann_000
 */
public class Circle extends Shape{
    private final double pi = 3.14;
    private double radius;
    private toaDo tam;

    public Circle(double radius, toaDo tam, String color) {
        super(color);
        this.radius = radius;
        this.tam = tam;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public toaDo getTam() {
        return tam;
    }

    public void setTam(toaDo tam) {
        this.tam = tam;
    }

    
    @Override
    public void move(double x, double y) {
         this.tam.setX(this.tam.getX()+x);
         this.tam.setY(this.tam.getY()+y);
    }
}
