package com.criss.bai1;

public class Main {
	public static void main(String[] args) {
		Diagram diagram = new Diagram();
		Layer layer = new Layer();
		diagram.addLayer(layer);

		Rectangle rectangle = new Rectangle();
		layer.addShape(rectangle);
		rectangle.setLength(50);
		rectangle.setWidth(20);

		Circle circle = new Circle();
		layer.addShape(circle);
		circle.setRadius(4);

		Square square = new Square();
		layer.addShape(square);
		square.setSide(50);

		Triangle triangle = new Triangle();
		layer.addShape(triangle);

		Shape[] shape = new Shape[3];
		shape[0] = circle;
		shape[1] = rectangle;
		shape[2] = square;
		System.out.println(shape[0].getParameter());
		System.out.println(shape[1].getParameter());
		System.out.println(shape[2].getParameter());

		if (layer.isThereTriangleLeft()) {
			layer.deleteTriangle();
			if (layer.isThereTriangleLeft())
				System.out.println("there are trianle left");
			else
				System.out.println("Remaining triangle: none ");
		}

		if (diagram.getLayer(0).isThereCircleLeft()) {
			diagram.deleteCircle();
			if (diagram.getLayer(0).isThereCircleLeft())
				System.out.println("there are circle left");
			else
				System.out.println("Remaining circle: none ");
		}

		if (diagram.getLayer(0).isThereSquareLeft())
			System.out.println("there are square left");
		else
			System.out.println("Remaining square: none ");

		if (diagram.getLayer(0).isThereRectangleLeft())
			System.out.println("there are rectangle left");
		else
			System.out.println("Remaining rectangle: none ");
	}
}
