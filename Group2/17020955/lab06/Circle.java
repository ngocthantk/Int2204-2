/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author TranTienPhong
 */
public class Circle extends Shape {
    protected double radius;
    final double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled, Toado tam) {
        super(color,filled,tam);
        this.radius = radius;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    @Override
    public void info(){
        System.out.println("hinh tron co ban kinh la: " + radius);
    }
}
