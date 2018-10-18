package Tuan06;

public class Square extends Rectangle {

	public Square() {}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, boolean canMove, boolean filled) {
		this(side);
		this.canMove = canMove;
		this.filled = filled;
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
		return "Name: Square\n" + "Move: " + canMove + "\nFilled: " + filled + "\nSide: " + width;
	}
	@Override
	public void move(double x, double y) {
		super.x=x;
		super.y=y;
	}
}