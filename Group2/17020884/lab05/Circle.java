package shape;

public class Circle extends Shape{
	
	protected double radius = 1.0;
	
	private final double pi = 3.141592653589793238462;
			
	public Circle() {
		//
	}
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return (pi*(radius*radius));
	}
	
	public double getPerimeter() {
		return (pi*(radius*2));
	}
}
