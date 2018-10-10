package com.criss.bai2;

public class Rectangle extends Shape {
	protected double width = 1.0;
	protected double length = 1.0;

	/**
	 * 
	 */
	public Rectangle() {
		super();
	}

	/**
	 * @param width
	 * @param length
	 */
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	/**
	 * @param color
	 * @param filled
	 * @param width
	 * @param length
	 */
	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
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

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}

}
