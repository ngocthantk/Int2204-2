package lab06;

public class Point {
	private double x;
	private double y;
	
	// Constructor
	public Point() {}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// getter, setter
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
	
	// caluclate
	public void movePoint(double x,double y) {
		this.x += x;
		this.y += y;
	}
	
	public double getDistance(Point A) {
		return Math.sqrt((this.x - A.x)*(this.x - A.x)+(this.y - A.y)*(this.y - A.y));
	}
	
	public boolean isPerpendicular(Point A, Point B) {
		double xx = (this.x-A.x) * (this.x-B.x);
		double yy = (this.y-A.y) * (this.y-B.y);
		if(xx + yy == 0) return true;
		return false;
	}
}
