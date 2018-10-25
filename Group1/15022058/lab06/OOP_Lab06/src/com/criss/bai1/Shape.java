package com.criss.bai1;

public class Shape {
	private String color;
	private boolean filled;

	// constructer
	Shape() {
	}

	// constructer
	Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public double getParameter() {
		return 1.0;
	}

	// get color
	public String getColor() {
		return color;
	}

	// set color
	public void setColor(String color) {
		this.color = color;
	}

	// check if rectangle is filled
	public boolean isFilled() {
		return filled;
	}

	// set filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// to string
	@Override
	public String toString() {
		return super.toString();
	}
}
