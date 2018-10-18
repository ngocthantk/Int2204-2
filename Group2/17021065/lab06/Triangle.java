package tuan6;

public class Triangle extends Shape{
	private Point A;
	private Point B;
	private Point C;
	
	public Triangle() {
		
	}
	public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
		A = new Point(xA, yA);
		B = new Point(xB, yB);
		C = new Point(xC, yC);
	}
	
	public Point getA() {
		return A;
	}
	public void setA(double x, double y) {
		A = new Point(x, y);
	}
	public Point getB() {
		return B;
	}
	public void setB(double x, double y) {
		B = new Point(x, y);
	}
	public Point getC() {
		return C;
	}
	public void setC(double x, double y) {
		C = new Point(x, y);
	}
	
	@Override
	public void size() {
		double e1 = A.CalcuEdge(B);
		double e2 = B.CalcuEdge(C);
		double e3 = C.CalcuEdge(A);
		double p = (e1+e2+e3)/2; 	
		System.out.println(Math.sqrt(p*(p-e1)*(p-e2)*(p-e3)));	
	}
	@Override
	public void move(double x, double y) {
		setA(x, y);
	}
	@Override
	public String toString() {
		return "Triangle";
	}
	
}
