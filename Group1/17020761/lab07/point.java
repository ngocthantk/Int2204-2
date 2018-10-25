package lab06;

public class point {
	private double x;
	private double y;
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
	public void moveP(double a,double b) {
		this.x+=a;
		this.y+=b;
	}
	public point(double a,double b) {
		x = a;
		y = b;
	}
	public double distance(point A ) {
		double a = ((this.x)-A.getX())*((this.x)-A.getX());
		double b = ((this.y)-A.getY())*((this.y)-A.getY());
		return Math.sqrt(a+b);
	}
	public boolean rightAngle(point A,point B) {
		double a = (this.x-A.getX())*(this.x-B.getX());
		double b = (this.y-A.getY())*(this.y-B.getY());
		if(a+b==0) {
			return true;
		} 
		return false;
	}
}
