package tuan6;

public class Retangle extends Shape {
	protected double width;
	protected double length;
	protected Point A;
	
	public Retangle() {
	
	}	
	public Retangle(double width, double length, double x, double y) {
		setA(x, y);
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
	public Point getA() {
		return A;
	}
	public void setA(double x, double y) {
		A = new Point(x, y);
	}
	@Override
	public void size() {	
		System.out.println(width*length);
	}

	@Override
	public void move(double x, double y) {
		this.setA(x, y);
	}
	@Override
	public String toString() {
		return "Retangle";
	}
}
