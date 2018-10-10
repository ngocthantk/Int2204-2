package lab05_01;

public class Circle extends Shape {


	private double radius = 1.0;
	private final double pi = Math.PI;

	// constructors
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	// getter and setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// caculate the area
	public double getArea() {
		return this.pi * this.radius * this.radius;
	}

	// caculate the perimeter
	public double getPerimeter() {
		return 2 * this.pi * this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pi=" + pi + "]";
	}

}
