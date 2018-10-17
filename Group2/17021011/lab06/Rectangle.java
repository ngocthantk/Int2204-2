package lab06;

public class Rectangle extends Shape {
	double width = 1.0;
	double length = 1.0;
	protected Point A, B, C, D;
	
	// Constructor
	public Rectangle() {}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, boolean canMove, boolean filled) {
		this.width = width;
		this.length = length;
		this.canMove = canMove;
		this.filled = filled;
	}
		
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}

	// Setter, getter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}

	public Point getD() {
		return D;
	}

	public void setD(Point d) {
		D = d;
	}

	// Calculate
	public double getArea() {
		return width*length;
	}
	
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	public String toString() {
		return "Name: Rectangle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nWidth: " + width + "\nLength: " + length +  "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}

	@Override
	public boolean check() {
		if(A.isPerpendicular(B, D) && B.isPerpendicular(A, C) && C.isPerpendicular(B, D)) {
			return true;
		}
		return false;
	}

	@Override
	public void move(double x, double y) {
		A.movePoint(x, y);
		B.movePoint(x, y);
		C.movePoint(x, y);
		D.movePoint(x, y);
	}
	
	
}