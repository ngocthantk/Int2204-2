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
public class Triangle extends Shape{
    private toaDo a;
    private toaDo b;
    private toaDo c;

    public toaDo getA() {
        return a;
    }

    public void setA(toaDo a) {
        this.a = a;
    }

    public toaDo getB() {
        return b;
    }

    public void setB(toaDo b) {
        this.b = b;
    }

    public toaDo getC() {
        return c;
    }

    public void setC(toaDo c) {
        this.c = c;
    }

    public Triangle(toaDo a, toaDo b, toaDo c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea(){
        return a.khoangCach(b)+a.khoangCach(c)+b.khoangCach(c);
    }
    public double getPerimeter(){
        double p= this.getArea()/2;
        return Math.sqrt(p*(p-a.khoangCach(b))*(p-a.khoangCach(c)*(p-b.khoangCach(c))));
                
    }
     @Override
    public void move(int x,int y){
        this.a.setX(this.a.getX()+x);
        this.a.setY(this.a.getY()+y);
    }       

    @Override
    public void draw(Graphics g) {
        g.drawLine(a.getX(),a.getY(), b.getX(), b.getY());
        g.drawLine(a.getX(),a.getY(), c.getX(), c.getY());
        g.drawLine(c.getX(),c.getY(), b.getX(), b.getY());
    }

   
}
