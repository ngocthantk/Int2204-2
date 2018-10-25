/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;


import java.awt.Graphics;

/**
 *
 * @author tuann_000
 */
public class Circle extends Shape{
    private final double pi = 3.14;
    private int radius;
    private toaDo tam;

    public Circle(int radius, toaDo tam, String color) {
        super(color);
        this.radius = radius;
        this.tam = tam;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public toaDo getTam() {
        return tam;
    }

    public void setTam(toaDo tam) {
        this.tam = tam;
    }
    @Override
    public void draw(Graphics g) {
        g.drawOval(tam.getX(), tam.getY(), radius, radius);
    }

    @Override
    public void move(int x, int y) {
        tam.setX(x+tam.getX());
        tam.setY(y+tam.getY());
    }

}
