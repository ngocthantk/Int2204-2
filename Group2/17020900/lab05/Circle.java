package minh.dim;

public class Circle extends Shape {
	final double PI = 3.14;
	private double radius;
	public Circle() {
		super();
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (this.radius*this.radius*PI);
	}
	public double getPerimeter() {
		return (2*this.radius*PI);
	}
	public String toString() {
		return "Circle [PI=" + PI + ", radius=" + radius + "]";
	}
	public static void main(String[] args) {
		Circle circle = new Circle(2.0, "red", true);
		System.out.println("chu vi hình tròn : " + circle.getPerimeter() + "\ndiện tích hình tròn : " + circle.getArea());
		System.out.println(circle.toString());
	}
}
