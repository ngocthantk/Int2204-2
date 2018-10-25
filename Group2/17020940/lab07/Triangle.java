package lab06;

import java.awt.geom.Point2D;

public class Triangle extends Shape{
	protected Point2D a ;
	protected Point2D b ;
	protected Point2D c ;
	public Triangle() {
		super();
	}
	public Triangle(double x1,double y1,double x2,double y2,double x3, double y3) {
		this.a = new Point2D.Double(x1, y1);
		this.b = new Point2D.Double(x2, y2);
		this.c = new Point2D.Double(x3, y3);
	}
	
	public Point2D getA() {
		return a;
	}
	public void setA(Point2D a) {
		this.a = a;
	}
	public Point2D getB() {
		return b;
	}
	public void setB(Point2D b) {
		this.b = b;
	}
	public Point2D getC() {
		return c;
	}
	public void setC(Point2D c) {
		this.c = c;
	}
	public boolean check() {
		return (!a.equals(b) && !b.equals(c) && !c.equals(a));
	}
	public boolean isTriangle() {
		if (check()) {
			Point2D p1 = new Point2D.Double(a.getX()-b.getX(), a.getY()-b.getY());
			Point2D p2 = new Point2D.Double(a.getX()-c.getX(), a.getY()-c.getY());
			return (!(p1.getX()*p2.getY()-p1.getY()*p2.getX()==0));
		}
		else return false;
	}
	public boolean equalTriangle1(Triangle t) {
		return (a.equals(t.getA())&& b.equals(t.getB()) && c.equals(t.getC()));
	}
	public boolean equalTriangle2 (Triangle t) {
		Triangle t1 = new Triangle(t.getA().getX(), t.getA().getY(), t.getC().getX(), t.getC().getY(), t.getB().getX(), t.getB().getY());
		Triangle t2 = new Triangle(t.getB().getX(), t.getB().getY(), t.getA().getX(), t.getA().getY(), t.getC().getX(), t.getC().getY());
		Triangle t3 = new Triangle(t.getB().getX(), t.getB().getY(), t.getC().getX(), t.getC().getY(), t.getA().getX(), t.getA().getY());
		Triangle t4 = new Triangle(t.getC().getX(), t.getC().getY(), t.getA().getX(), t.getA().getY(), t.getB().getX(), t.getB().getY());
		Triangle t5 = new Triangle(t.getC().getX(), t.getC().getY(), t.getB().getX(), t.getB().getY(), t.getA().getX(), t.getA().getY());
		return (this.equalTriangle1(t) ||this.equalTriangle1(t1) ||this.equalTriangle1(t2)||this.equalTriangle1(t3)||this.equalTriangle1(t4)||this.equalTriangle1(t5));
		
	}
	public boolean equalTriangle (Shape t) {
		if (t instanceof Triangle) {
			return (((Triangle) t).equalTriangle2(this));
		}
		else return false;
	}
}
