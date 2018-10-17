package lab05;

public class circle {
	public static final double PI = 3.14;
	private shape Shape;
	private double radius;
	public shape getShape() {
		return Shape;
	}
	public void setShape(shape shape) {
		Shape = shape;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area=2* radius*PI;
		return area;
	}
	public double getPerimeter() {
		double Perimeter=radius*radius*PI;
		return Perimeter;
	}
	@Override
	public String toString() {
		return "circle [Shape=" + Shape + ", radius=" + radius + "]";
	}
	

}
