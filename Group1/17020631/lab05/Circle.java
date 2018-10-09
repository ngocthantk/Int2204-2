package lab05;

public class Circle extends Shape {
	double radius=1.0;
	final float Pi=3.14f;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color, boolean filled) {
		super(color,filled);
		this.radius=radius;
		//this.color=color;
		//this.filled=filled;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return this.radius*this.radius*Pi;
	}
	public double getPerimeter() {
		return this.radius*2*Pi;
	}

}
