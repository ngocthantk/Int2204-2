package lab06;

public class Rectangle extends Shape {
	protected Position p1;
	protected Position p2;
	protected Position p3;
	protected Position p4;
	public Position getP1() {
		return p1;
	}
	public void setP1(double x , double y) {
		this.p1 = new Position(x, y);
	}
	public Position getP2() {
		return p2;
	}
	public void setP2(double x , double y) {
		this.p2 = new Position(x, y);
	}
	public Position getP3() {
		return p3;
	}
	public void setP3(double x , double y ) {
		this.p3 = new Position(x, y);
	}
	public Position getP4() {
		return p4;
	}
	public void setP4(double x , double y) {
		this.p4 = new Position(x, y);
	}
	public Rectangle (double x1 , double y1, double x2, double y2, double x3, double y3,double x4,double y4) {
		this.p1 = new Position(x1, y1);
		this.p2 = new Position(x2, y2);
		this.p3 = new Position(x3, y3);
		this.p4 = new Position(x4, y4);
	}
	public Rectangle(String color) {
		super(color);
	}
	public boolean check() {
		double a = p1.distance(p2);
		double b = p1.distance(p3);
		double c = p1.distance(p4);
		if (p1.rightAngle(p2, p4) && p2.rightAngle(p1, p3) && p3.rightAngle(p2, p4) && a!=c) return true;
		if (p1.rightAngle(p2, p3) && p2.rightAngle(p1, p4) && p3.rightAngle(p1, p4) && a!=b) return true;
		if (p1.rightAngle(p3, p4) && p2.rightAngle(p3, p4) && p3.rightAngle(p2, p1) && b!=c) return true;
		return false ;
	}
	public void move (double a , double b) {
		p1.Move(a, b);
		p2.Move(a, b);
		p3.Move(a, b);
		p4.Move(a, b);
	}
}
