package bai2;

public class Circle extends Shape {
	private double radius = 1.0;
	final double PI = 3.14;
	
	public Circle() {}
	 
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius,String color,boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
//get radius    
    public double getRadius() {
        return radius;
    }
//set radius   
    public void setRadius(double radius) {
        this.radius = radius;
    }
//get Area   
    public double getArea() {
        return(PI*this.radius*this.radius);
    }
//get Perimeter    
    public double getPerimeter() {
        return (2*PI*this.radius);
    }
    
    public String toString() {
    	return "Circle ";
    }
}
