package tuan6;

public class Point {
	public double x;
	public double y;
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {
		
	}
	public double CalcuEdge(Point P) {
		return Math.sqrt(Math.pow(this.x-P.x, 2) + Math.pow(this.y-P.y, 2));
	}
}
