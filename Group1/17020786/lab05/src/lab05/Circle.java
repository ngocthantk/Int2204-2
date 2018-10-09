/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Liscli
 */
public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14159265359;
    // init
    public Circle(){
        super();
        radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    // trả về bán kính của hình tròn
    public double getRadius(){
        return this.radius;
    }
    //cài chỉ số của bán kính hình tròn
    public void setRadius(double radius){
        this.radius = radius;
    }
    //trả về diện tích của hình tròn
    public double getArea(){
        return this.PI*this.radius*this.radius;
    }
    //trả về chu vi của hình tròn
    public double getPerimeter(){
        return 2*this.PI*this.radius;
    }
}
