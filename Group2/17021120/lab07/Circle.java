/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;
 /**
 *
 * @author admin
 */
public class Circle extends Shape{
    private double radius;
    private final double PI = Math.PI;
    
    public Circle(double r, String n, boolean i,double x, double y){
        super(n,i,x,y);
        this.radius = r;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double getArea(){
        return PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*PI*this.radius;
    }
    @Override
    public String toString(){
        return this.getColor()+" "+this.isFilled()+" "+this.getArea()+" "+this.getPerimeter();
    }
}