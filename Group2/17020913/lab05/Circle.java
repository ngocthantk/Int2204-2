package KeThua_2;

public class Circle extends Shape {
	double Pi = Math.PI; 
	double radius = 1.0;
	public Circle() {};
	public Circle(double radius) {
		this.radius = radius;
	};
	
	public  Circle( double radius, String color, boolean filled) {
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
		return radius*Pi*Pi;
	}
	public double getChuvi() {
		return radius*2*Pi;
	}
	@Override
	public String toString() {
		
		return this.getColor() + "," + this.filled +","+ this.radius;
		
	}
}
