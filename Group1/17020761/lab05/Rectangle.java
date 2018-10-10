package chap05.oop2;

public class Rectangle extends Shape{
	protected double width = 1.0;
	protected double length = 2.0;
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double x) {
		this.width = x;
	}
	public double getLength() {
		return this.length;
	}
	public void setLength(double y) {
		this.length = y;
	}
	public double Area() {
		return this.width * this.length;
	}
	public double Perimeter() {
		return 2*(this.width+this.length);
	}
	public Rectangle() {
		
	}
	public Rectangle(double x,double y) {
		this.width=x;
		this.length = y;
	}
	public Rectangle(double x,double y,String s,boolean a) {
		this.width=x;
		this.length = y;
		this.setColor(s);
		this.setFilled(a);
	}
	@Override
	public String toString() {
		return "xyz";
	}
}
