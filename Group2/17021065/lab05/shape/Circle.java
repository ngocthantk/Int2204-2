package tuan5.shape;

public class Circle extends Shape {
	public double radius;
	public final double PI = Math.PI;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, Boolean filled) {
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
		return PI*this.radius*this.radius;
	}
	public double getPerimeter() {
		return 2*PI*this.radius;
	}
	@Override
	public String toString() {
		return "Circle";
	}
}
