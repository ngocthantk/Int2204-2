package Tuan06;

public class Circle extends Shape {
	private final double PI = Math.PI;
	double radius;

	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}	

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	

	public String toString() {
		return "Name: Circle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nRadius: " + radius;
	}
	@Override
	public void move(double x, double y) {
		super.x=x;
		super.y=y;
	}
	
}
