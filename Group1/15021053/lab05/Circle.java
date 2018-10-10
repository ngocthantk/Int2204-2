/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Nhozx
 */
//lop circle  ke thua lop shape
public class Circle extends Shape{
    protected double radius = 1.0;
    final double PI = 3.14;//de PI la hang vi day la so khong thay doi gia tri
    //ham khoi tao khong tham so
    public Circle(){}
    
    public Circle(double radius){
        this.radius = radius;
    }
    //ham khoi tao
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    //ham getter, setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //tinh dien tich
    public double getArea(){
        return PI * radius * radius;
    }
    //tinh chu vi
    public double getPerimeter(){
        return PI * 2 * radius;
    }
    
    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", color=" + color + ", filled=" + filled + '}';
    }
}
