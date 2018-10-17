package tuan6;

public class Circle extends Shape {
	private double radian;
	private Point central;
	private final double PI = Math.PI;
	
	public Circle() {
		
	}
	public Circle(double radian, double x, double y) {
		setCentral(x, y);
		this.radian = radian;
	}
	
	public double getRadian() {
		return radian;
	}
	public void setRadian(double radian) {
		this.radian = radian;
	}
	public Point getCentral() {
		return central;
	}
	public void setCentral(double x, double y) {
		this.central = new Point(x, y);
	}
	
	@Override
	public void size() {
		System.out.println(radian*radian*PI);
	}

	@Override
	public void move(double x, double y) {
		setCentral(x, y);
	}
	@Override
	public String toString() {
		return "Circle";
	}
}
