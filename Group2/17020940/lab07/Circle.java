package lab06;

import java.awt.geom.Point2D;

public class Circle extends Shape  {
	private double radius;
	private Point2D p  ;
	 
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double  radius, double x , double y) {
		super();
		this.radius = radius;
		this.p = new Point2D.Double(x, y);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Point2D getP() {
		return p;
	}

	public void setP(Point2D p) {
		this.p = p;
	}
	public boolean equalCircle(Shape c) {
		if (c instanceof Circle && !(c instanceof Hexagon)) {
			return (this.getP().equals(((Circle) c).getP()) && this.getRadius()==((Circle) c).getRadius());
		}
		else return false ;
	}
	public static void main(String[] args) {
		Circle c = new Circle(100, 100, 100);
		Hexagon c1 = new Hexagon(100, 100, 100);
		System.out.println(c.equalCircle(c1));
	}
}
