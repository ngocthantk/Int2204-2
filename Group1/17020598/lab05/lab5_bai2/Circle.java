/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class Circle extends Shape{
    
    final double PI= 3.14;
    private double radius;  
    public Circle()
    {

    };
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled)
    {   
        super(color, filled);
    	this.radius=radius;

    } 
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
   
    public double getArea()
    {
        return(PI*(this.radius*this.radius));
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
