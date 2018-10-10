package com.criss.bai2;

public class Square extends Rectangle {
	protected double side;

	public Square() {
		super();
	}

	public Square(String color, boolean filled, double side) {
		this.color = color;
		this.filled = filled;
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void setWidth(double width) {
		// TODO Auto-generated method stub
		super.setWidth(width);
	}

	@Override
	public void setLength(double length) {
		// TODO Auto-generated method stub
		super.setLength(length);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getArea();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return super.getPerimeter();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
