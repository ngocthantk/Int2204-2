package lab06;

public class Square extends Rectangle {
	
	// Constructor
	public Square() {}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, boolean canMove, boolean filled) {
		this(side);
		this.canMove = canMove;
		this.filled = filled;
	}
	
	public Square(Point a, Point b, Point c, Point d) {
		A = a;
		B = b;
		C = c;
		D = d;
	}
	
	// Setter, getter
	public double getSide() {
		return width;
	}
	
	public void setSide(double side) {
		width = length = side;
	}
	
	public void setWidth(double side) {
		this.width = this.length = side;
	}
	
	public void setLength(double side) {
		this.length = this.width = side;
	}

	public String toString() {
		return "Name: Square\n" + "Move: " + canMove + "\nFilled: " + filled + "\nSide: " + width +  "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
	
	// calculate
	public boolean check() {
		if(A.getDistance(B) == A.getDistance(D)) return true;
		return false;
	}
}