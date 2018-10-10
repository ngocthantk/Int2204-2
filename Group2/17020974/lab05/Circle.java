/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author admincxq
 */
public class Circle extends Shape {
    private double radius=1.0;
    public double PI=3.14;
    public Circle(){}
    public Circle(double r){
        this.radius=r;
    }
    public Circle(double r,String color,boolean filled){
        super(color,filled);
        this.radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    @Override
    public String toString(){
        return this.radius+" "+getArea()+" "+getPerimeter();
    }
}

