package lab05;

public class Circle extends Shape{
	protected double pi = 3.14;
	protected double radius = 1.0;
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		setRadius(radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*pi;
	}
	public double getPerimeter() {
		return radius*2*pi;
	}
	public String toString() {
		return ("Color: "+getColor()+"\nfilled:"+isFilled()+"\nArea: "+ getArea()+"\nPerimeter: "+getPerimeter());
	}
	public static void main(String[] args) {
    	Circle circle = new Circle("Orange",true, 5);
    	System.out.print(circle.toString());
	}
}
