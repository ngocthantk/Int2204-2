package lap07;

public class Point {
	private double m;
	private double n;
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	public void moveP(double a,double b) {
		this.m+=a;
		this.n+=b;
	}
	public Point(double a,double b) {
		m = a;
		n = b;
	}
	public double distance(Point A ) {
		double a = ((this.m)-A.getM())*((this.m)-A.getM());
		double b = ((this.n)-A.getN())*((this.n)-A.getN());
		return Math.sqrt(a+b);
	}
	public boolean rightAngle(Point A,Point B) {
		double a = (this.m-A.getM())*(this.m-B.getM());
		double b = (this.n-A.getN())*(this.n-B.getN());
		if(a+b==0) {
			return true;
		} 
		return false;
	}
}