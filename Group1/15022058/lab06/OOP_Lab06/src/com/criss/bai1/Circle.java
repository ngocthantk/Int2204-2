package com.criss.bai1;

public class Circle extends Shape {
	private double radius;
	private final double PI = 3.14;
	private double centerPoint_X;
	private double centerPoint_Y;

	// constructer
	Circle() {
	}

	// constructer
	Circle(double radius, double X, double Y) {
		this.radius = radius;
		this.centerPoint_X = X;
		this.centerPoint_Y = Y;
	}

	// consructer
	Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.setColor(color);
		this.setFilled(filled);
	}

	// set radius
	public void setRadius(double r) {
		this.radius = r;
	}

	// get radius
	public double getRadius() {
		return radius;
	}

	// get parameter
	public double getParameter() {
		return PI * radius * 2;
	}

	// get area
	public double getArea() {
		return PI * radius * radius;
	}

	// set x of centerpoint
	public void setCenterPoint_X(double X) {
		this.centerPoint_X = X;
	}

	// get x of centerponit
	public double getCenterPoint_X() {
		return centerPoint_X;
	}

	// set y of centerpoint
	public void setCenterPoint_Y(double Y) {
		this.centerPoint_Y = Y;
	}

	// get y of centerpoint
	public double getCenterPoint_Y() {
		return centerPoint_Y;
	}

	// use to move the circle
	public void moveCircle(double X, double Y) {
		centerPoint_X += X;
		centerPoint_Y += Y;
	}

	// to string
	@Override
	public String toString() {
		return super.toString();
	}
}
