package Tuan06;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Rectangle extends Shape {
	double width = 1.0;
	double length = 1.0;

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
	
	public String toString() {
		return "Name: Rectangle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nWidth: " + width + "\nLength: " + length;
	}
	@Override
	public void move(double x, double y) {
		super.x=x;
		super.y=y;
	}
}


