package Cau2;

public class Circle extends Shape {
	// Khai Bao Chieu Rong va Pi(Voi Pi la` const)
	private double radius = 1.0;
	private final double PI = 3.14;

	public Circle() {

	}

	public Circle(double Radius) {
		this.radius = Radius;
	}

	public Circle(double Radius, String Color, boolean Filled) {
		this.radius = Radius;
		this.setColor(Color);
		this.setFilled(Filled);
	}

	// Tinh Dien Tich
	public double getArea() {
		return (PI * this.radius * this.radius);
	}

	// Tinh Chu Vi
	public double getPerimeter() {
		return (2 * PI * this.radius);
	}
	public String toString()
	{
		return this.getColor()+','+this.isFilled()+','+this.radius;
	}
}
