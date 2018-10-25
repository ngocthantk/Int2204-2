package com.criss.bai1;

public class Square extends Rectangle {
	private double side;

	// constructer
	public Square() {
	}

	// constructer
	public Square(double side) {
		this.side = side;
	}

	// constructer
	public Square(double side, String color, boolean filled) {
		this.side = side;
		this.setColor(color);
		this.setFilled(filled);
	}

	// get side
	public double getSide() {
		return this.side;
	}

	// set side
	public void setSide(double side) {
		this.side = side;
	}

	// get parameter
	@Override
	public double getParameter() {
		return side * 4;
	}

	// get area
	@Override
	public double getArea() {
		return side * side;
	}

	// to string
	@Override
	public String toString() {
		return super.toString();
	}

	public boolean isSameSquare(Square a) {
		return super.isSameRectangle(a);
	}
}
