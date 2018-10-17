package lab6;

public class Circle extends Shape {
	private final double PI = 3.14159;
	double radius;
	private Point I;

	// Setter, getter 
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Point getCenter() {
		return I;
	}
	public void setCenter(Point center) {
		this.I = center;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*PI*radius;
	}
	
        @Override
	public String toString() {
		return "Name: Circle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
	@Override
	public boolean check() {
		if(radius > 0) return true;
		return false;
	}
	@Override
	public void move(double x, double y) {
		I.movePoint(x, y);
	}
}
