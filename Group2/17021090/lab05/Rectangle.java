package lab05_01;

public class Rectangle extends Shape {

	private double width = 1.0;
	private double length = 1.0;

	// constructors
	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	// getter and setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	// caculate the Area
	public double getArea() {
		return this.width * this.length;
	}

	// caculate the perimeter
	public double getPerimeter() {
		return 2 * (this.width + this.length);
	}
	

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

}
