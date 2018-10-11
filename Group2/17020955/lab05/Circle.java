/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5_1;

/**
 *
 * @author TranTienPhong
 */
public class Circle extends Shape {
    protected double radius = 1;
    protected final double PI = Math.PI;
    public Circle(){}
public Circle(double radius,String color, boolean filled) {
    super(color,filled);
    this.radius = radius;
}


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*this.radius*this.radius;
    }
    public double Perimeter(){
        return 2*PI*this.radius;
    }
    @Override
    public String toString(){
        return this.color +"," +this.filled+this.radius;
    }
    
    
    
}


