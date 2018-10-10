package lab05;

public class Rectangle extends Shape {
	double width=1.0;
	double length=1.0;
	public Rectangle() {
		
	}
	public Rectangle(double width,double length) {
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width,double length,String color,boolean filled) {
		super(color,filled);
		this.width=width;
		this.length=length;
		//this.color=color;
		//this.filled=filled;
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
	public double Perimeter() {
		return 2*(this.length+this.length);
	}
}
