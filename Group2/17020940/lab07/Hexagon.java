package lab06;

import java.awt.geom.Point2D;

public class Hexagon extends Circle{
	public Hexagon() {
		super();
	}
	public Hexagon(double radius, double x, double y) {
		super (radius,x,y);
	}
	public Point2D getP1() {
		return new Point2D.Double(this.getP().getX(),this.getP().getY()-this.getRadius());
	}
	public Point2D getP2() {
		return new Point2D.Double(this.getP().getX()-this.getRadius()*Math.sin(30), this.getP().getY()-this.getRadius()/2);
	}
	public Point2D getP3() {
		return new Point2D.Double(this.getP().getX()-this.getRadius()*Math.sin(30), this.getP().getY()+this.getRadius()/2);
	}
	public Point2D getP4() {
		return new Point2D.Double(this.getP().getX(),this.getP().getY()+this.getRadius());
	}
	public Point2D getP5() {
		return new Point2D.Double(this.getP().getX()+this.getRadius()*Math.sin(30), this.getP().getY()+this.getRadius()/2);
	}
	public Point2D getP6() {
		return new Point2D.Double(this.getP().getX()+this.getRadius()*Math.sin(30), this.getP().getY()-this.getRadius()/2);
	}
	public boolean equalHexagon(Shape h) {
		if ( h instanceof Hexagon) {
			return (this.getP().equals(((Hexagon)h).getP()) && ((Hexagon) h).getRadius()==this.getRadius());
		}
		else return false ;
	}
}
