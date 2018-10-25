package com.criss.bai1;

public class Rectangle extends Shape {
	private double width;
	private double length;
	private double HorizontalPoint;
	private double VerticalPoint;

	// constructer
	public Rectangle() {
	}

	// constructer
	public Rectangle(double width, double length, double X, double Y) {
		this.width = width;
		this.length = length;
		this.HorizontalPoint = X;
		this.VerticalPoint = Y;
	}

	// constructer
	public Rectangle(String color, boolean filled) {
		this.setColor(color);
		this.setFilled(filled);
	}

	// set width
	public void setWidth(double width) {
		this.width = width;
	}

	// get width
	public double getWidth() {
		return width;
	}

	// get length
	public double getLength() {
		return length;
	}

	// set length
	public void setLength(double length) {
		this.length = length;
	}

	// set x of top horizonpoint in the left
	public void setHorizontalPoint(double horizontalPoint) {
		this.HorizontalPoint = horizontalPoint;
	}

	// get x of top horizontal point in the left
	public double getHorizontalPoint() {
		return HorizontalPoint;
	}

	// set y of top horizontal point in the left
	public void setVerticalPoint(double verticalPoint) {
		this.VerticalPoint = verticalPoint;
	}

	// get Y of top horizontal point in the left
	public double getVerticalPoint() {
		return VerticalPoint;
	}

	// get area
	public double getArea() {
		return this.width * this.length;
	}

	// get parameter
	public double getParameter() {
		return (this.width + this.length) * 2;
	}

	// use to move rectangle
	public void moveRectangle(double X, double Y) {
		HorizontalPoint += X;
		VerticalPoint += Y;
	}

	// to string
	@Override
	public String toString() {
		return super.toString();
	}
}
