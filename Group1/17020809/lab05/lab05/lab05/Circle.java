/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class Circle extends Shape {
    protected double radius;
    double pi = 3.14;//Khởi tạo số pi
    double area;
    double perimeter;
   public Circle(){
       
   }

    public Circle(double radius) {
        this.radius = radius;
    }
   

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        area = pi*this.radius*this.radius;//Tính diện tích
        return area;
    }

    public double getPerimeter() {
        perimeter = 2*pi*this.radius;//Tính chu vi

        return perimeter;
    }
    
}
