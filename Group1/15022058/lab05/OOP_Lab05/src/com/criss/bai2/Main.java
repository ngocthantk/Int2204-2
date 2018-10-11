package com.criss.bai2;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.setColor("blue");
		System.out.println(shape.getColor());
		System.out.println(shape.toString());
		System.out.println("-----------");

		Circle circle = new Circle();
		circle.setRadius(4.0);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		System.out.println(circle.toString());
		System.out.println("-----------");

		Rectangle rectangle = new Rectangle();
		rectangle.setLength(50.0);
		rectangle.setWidth(20.0);
		System.out.println(rectangle.getArea());
		System.out.println("-----------");

		Square square = new Square();
		square.setLength(50);
		square.setWidth(50);
		System.out.println(square.toString());
		System.out.println(square.getArea());
	}

}
