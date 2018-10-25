/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1lab05;

/**
 *
 * @author Dat Anh
 */
public class Triangle extends Shape{
    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c, int x, int y, boolean filled, boolean visible, String color) {
        super(x, y, filled, visible, color);
        this.a = a;
        this.b = b;
        this.c = c;
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
 

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + ", x=" + x + ", y=" + y + ", filled=" + filled + ", visible=" + visible + ", color=" + color + '}';
    }
}