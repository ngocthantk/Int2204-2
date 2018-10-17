package lab06;

public class Position {
	private double x ;
	private double y ;
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void Move (double a ,double b) {
		this.x+=a;
		this.y+=b;
	}
	public double distance(Position p) {
		double a = this.x - p.getX();
		double b = this.y - p.getY();
		return Math.sqrt(a*a+b*b);
	}
	public boolean rightAngle(Position p1, Position p2) {
		double a = (x-p1.getX())*(x-p2.getX())+(y-p1.getY())*(y-p2.getY());
		return (a==0);
	}
}