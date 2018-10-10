package com.criss.bai2;

public class Circle extends Shape {
	protected double radius = 1.0;
	final double PI = 3.14;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * PI;
	}

	public double getPerimeter() {
		return 2 * radius * PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", PI=" + PI + ", color=" + color + ", filled=" + filled + "]";
	}

}
