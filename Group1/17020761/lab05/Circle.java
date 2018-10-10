package chap05.oop2;

public class Circle extends Shape{
	private double radius = 1.0;
	final double PI = 3.14;
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double x) {
		this.radius = x;
	}
	public double Area() {
		return PI*this.radius*this.radius;
	}
	public double Perimeter() {
		return 2*PI*this.radius;
	}
	public Circle() {}
	public Circle(double r) {
		this.radius = r;
	}
	public Circle(double r,String s,boolean a) {
		super(s,a);
		this.radius = r;
		
	}
	@Override
	public String toString() {
		return "abc";
	}
}
