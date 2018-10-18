package com.criss.bai1;

public class Triangle extends Shape {
	private double sideLeft;
	private double sideRight;
	private double topPoint_X;
	private double topPoint_Y;
	private double angle; //góc

	// constructer
	public Triangle(double sideLeft, double sideRight, double X, double Y, double angle) {
		this.sideLeft = sideLeft;
		this.sideRight = sideRight;
		this.topPoint_X = X;
		this.topPoint_Y = Y;
		this.angle = angle;
	}

	// constructer
	public Triangle() {
	}

	// get side left
	public double getSideLeft() {
		return sideLeft;
	}

	// set side left
	public void setSideLeft(double sideLeft) {
		this.sideLeft = sideLeft;
	}

	// get side right
	public double getSideRight() {
		return sideRight;
	}

	// set side right
	public void setSideRight(double sideRight) {
		this.sideRight = sideRight;
	}

	// get x of top point
	public double getTopPoint_X() {
		return topPoint_X;
	}

	// set x of top point
	public void setTopPoint_X(double X) {
		this.topPoint_X = X;
	}

	// get y of top point
	public double getTopPoint_Y() {
		return topPoint_Y;
	}

	// set y of top point
	public void setTopPoint_Y(double Y) {
		this.topPoint_Y = Y;
	}

	// get angle of top point
	public double getAngle() {
		return angle;
	}

	// set angle of top point
	public void setAngle(double angle) {
		this.angle = angle;
	}

	// use to move triangle
	public void moveTriangle(double X, double Y) {
		topPoint_X += X;
		topPoint_Y += Y;
	}
}
