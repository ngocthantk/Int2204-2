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
public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(boolean fill, double x1, double x2, double x3) {
        super(fill);
        this.a = x1;
        this.b = x2;
        this.c = x3;
    }
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
}
