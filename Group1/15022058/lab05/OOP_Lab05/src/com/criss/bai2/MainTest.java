package com.criss.bai2;

import org.junit.*;

import junit.framework.TestCase;

public class MainTest extends TestCase {

	@Test
	public void TestShape() {
		Shape shape = new Shape();
		shape.setFilled(false);
		shape.setColor("red");
		assertEquals(false, shape.isFilled());
		assertEquals("red", shape.getColor());
		// System.out.println(shape.getColor());

		Circle circle = new Circle();
		circle.setRadius(4.0);
		assertEquals(4.0, circle.getRadius());
		assertEquals(25.12, circle.getPerimeter());
		assertEquals(50.24, circle.getArea());
		// System.out.println(circle.getArea());

		Rectangle rectangle = new Rectangle();
		rectangle.setLength(50.0);
		rectangle.setWidth(20.0);
		assertEquals(50.0, rectangle.getLength());
		assertEquals(20.0, rectangle.getWidth());
		assertEquals(1000.0, rectangle.getArea());
		assertEquals(140.0, rectangle.getPerimeter());
		// System.out.println(rectangle.getArea());

		Square square = new Square(null, false, 50);
		assertEquals(50.0, square.getSide());
		assertEquals(2500.0, square.getArea());
		// System.out.println(square.getArea());
	}
}
