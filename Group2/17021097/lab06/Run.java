package phamanh.tu;

import java.util.ArrayList;

public class Run {

	public static void main(String[] args) {
		
		toado A = new toado(1, 2);
		toado B = new toado(3, 4);
		toado C = new toado(5, 6);
		
		Triangle triangle = new Triangle(A, B, C);
		ArrayList<Shape> shape = new ArrayList<Shape>();
		shape.add(triangle);
		System.out.println(shape.size());
		Layer layer = new Layer();
		layer.deleteAllTriangle(shape);
		System.out.println(shape.size());
		/*
		Circle circle = new Circle(A, 5);
		shape.add(circle);
		Diagram diagram = new Diagram();
		diagram.deleteAllCircle(shape);
		System.out.println(shape.size());
		*/
	}

}
