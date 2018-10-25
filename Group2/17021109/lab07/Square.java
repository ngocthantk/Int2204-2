package Tuan06;

import java.awt.Graphics;

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
	public int getSide() {
		return (int) width;
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
	public void move(int x, int y) {
		super.x=x;
		super.y=y;
	}
	
}