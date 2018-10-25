package Tuan06;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Rectangle extends Shape {
	double width ;
	double length ;

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

	public int getWidth() {
		return(int) width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public int getLength() {
		return(int) length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public String toString() {
		return "Name: Rectangle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nWidth: " + width + "\nLength: " + length;
	}
	@Override
	public void move(int x, int y) {
		super.x=x;
		super.y=y;
	}
}


