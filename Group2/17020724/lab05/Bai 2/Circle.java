package ex2;

public class Circle extends Shape{
	private double radius = 1.0;
	final double PI = 3.1415926535897;
	public Circle(){}
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super();
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*PI;
	}
	public double getPerimeter() {
		return 2*radius*PI;
	}
	public String toString() {
		return "Circle\nRadius = " + getRadius() + "\nArea = " + getArea() + "\nPerimeter = " + getPerimeter() +"\n";
	}
	
}
