package lab06;

public class Triangle extends Shape{
	protected Position a ;
	protected Position b ;
	protected Position c ;
	public Triangle() {
		super();
	}
	public Triangle(double x1,double y1,double x2,double y2,double x3, double y3) {
		this.a = new Position(x1, y1);
		this.b = new Position(x2, y2);
		this.c = new Position(x3, y3);
	}
	public Position getA() {
		return a;
	}
	public void setA(double x,double y) {
		this.a = new Position(x, y);
	}
	public Position getB() {
		return b;
	}
	public void setB(double x,double y) {
		this.b = new Position(x, y);
	}
	public Position getC() {
		return c;
	}
	public void setC(double x,double y) {
		this.c = new Position(x, y);
	}
	public Triangle (String color) {
		super(color);
	}
	public boolean check() {
		return (a!=b && b!=c && c!=a);
	}
	public void move(double x, double y) {
		a.Move(x, y);
		b.Move(x, y);
		c.Move(x, y);
	}
}
