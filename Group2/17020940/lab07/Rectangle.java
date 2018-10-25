package lab06;

import java.awt.geom.Point2D;



public class Rectangle extends Shape {
	private Point2D p ;
	private double w ;
	private double h ;
	public Rectangle() {
		super();
	}
	public Rectangle(double x, double y,double w , double h) {
		super();
		this.p = new Point2D.Double(x,y);
		this.w = w ;
		this.h = h ;
	}
	public Point2D getP() {
		return p;
	}

	public void setP(Point2D p) {
		this.p = p;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	public boolean equalRextangle(Shape r) {
		if (r instanceof Rectangle && !(r instanceof Square)) {
			return (this.getP().equals(((Rectangle) r).getP()) && this.getW()== ((Rectangle) r).getW()&& this.getH()==((Rectangle) r).getH());
		}
		else return false;
	}
}