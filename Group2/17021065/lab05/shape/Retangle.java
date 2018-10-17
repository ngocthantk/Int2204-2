package tuan5.shape;

public class Retangle extends Shape {
	public double width = 1.0;
	public double length = 1.0;
	public Retangle() {
		
	}
	public Retangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Retangle(double width, double length, String color, Boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
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
	public double getArea() {
		return this.width*this.length;
	}
	public double getPerimeter() {
		return (this.width+this.length)*2;
	}
	@Override
	public String toString() {
		return "Retangle";
	}
}
