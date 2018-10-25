package com.criss.bai1;

import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JunitTest {
	Diagram diagram = new Diagram();
	Layer layer = new Layer();
	Rectangle rectangle = new Rectangle();
	Circle circle = new Circle();
	Square square = new Square();
	Triangle triangle = new Triangle();

	// setup
	@Before
	public void setup() throws Exception {
		System.out.println("setup");

		layer.addShape(rectangle);
		layer.addShape(circle);
		layer.addShape(square);
		layer.addShape(triangle);

		diagram.addLayer(layer);

		rectangle.setLength(100);
		rectangle.setWidth(50);
		rectangle.setHorizontalPoint(100);
		rectangle.setVerticalPoint(200);

		circle.setRadius(4);

		square.setSide(50);
	}

	// test deleteTriangle in layer
	@Test
	public void testDeleteTriangle() {
		System.out.println("running testDeleteTriangle \n");
		layer.deleteTriangle();
		assertEquals(false, layer.isThereTriangleLeft());
	}

	// test deleteCircle in diagram
	@Test
	public void testDeleteCircle() {
		System.out.println("Running testDeleteTriangle" + "\n");
		diagram.deleteCircle();
		assertEquals(false, diagram.getLayer(0).isThereCircleLeft());
	}

	// Test parameter and area in rectangle
	@Test
	public void testRectangle() {
		System.out.println("running testRectangle \n");
		assertEquals(100, rectangle.getLength(), 0);
		assertEquals(50, rectangle.getWidth(), 0);
		assertEquals(100, rectangle.getHorizontalPoint(), 0);
		assertEquals(200, rectangle.getVerticalPoint(), 0);
		assertEquals(5000, rectangle.getArea(), 0);
		assertEquals(300, rectangle.getParameter(), 0);
	}

	// test area and parameter in circle
	@Test
	public void testCircle() {
		System.out.println("running testCircle \n");
		assertEquals(4, circle.getRadius(), 0);
		assertEquals(50.24, circle.getArea(), 0);
		assertEquals(25.12, circle.getParameter(), 0);
	}

	// test area and parameter in circle
	@Test
	public void testSquare() {
		System.out.println("running testSquare \n");
		assertEquals(200, square.getParameter(), 0);
		assertEquals(2500, square.getArea(), 0);
	}
}
