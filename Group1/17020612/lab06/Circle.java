/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Admin
 */
public class Circle extends Shape {
    protected double radius; // Các thuộc tính mới của lớp Circle
    final double PI=3.14;
   
    //Các constructor
    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled)
    {
        super(color,filled);
        this.radius=radius;
    }
    
    //Hàm get set
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return(PI*this.radius*this.radius);
    }
    public double getPerimeter()
    {
        return (2*PI*this.radius);
    }
    @Override
    public String toString() {
    	return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
    }
}
