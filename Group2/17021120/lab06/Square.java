package lab06;

public class Square extends Rectangle {
	
	// Constructor
	public Square() {}
	
	public Square(Point A,Point B,Point C,Point D) {
		super(A,B,C,D);
	}
	
	public Square(Point A,Point B,Point C,Point D, boolean canMove, boolean filled) {
		super(A,B,C,D);
		this.canMove = canMove;
		this.filled = filled;
	}
	

        @Override
	public String toString() {
		return "Name: Square\n" + "Move: " + canMove + "\nFilled: " + filled + "\nSide: " + super.A.Distance(B) +  "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}