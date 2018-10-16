package Bai2;

public class Circle extends Shape{
	protected double radius = 1.0;
	final double PI = 3.14;
	public Circle() {	
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color= color;
		this.filled= filled;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double Area = radius*radius*PI;
		return Area;
	}
	public double getPerimeter() {
		double Perimeter = 2*PI*radius;
		return Perimeter;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius +"color=" + color + ", filled=" + filled +  "]";
	}
	
	
	

}
