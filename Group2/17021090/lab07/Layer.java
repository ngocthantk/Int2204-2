package lab06;

import java.util.ArrayList;

import javafx.collections.ObservableList;

public class Layer {
	private ArrayList<Shape> shapes = new ArrayList<>();

	public void add(Shape shape) {
		shapes.add(shape);
	}

	public Shape get(int x) {
		return shapes.get(x);
	}

	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}

	public void deleteTriangle() {
		ArrayList<Shape> temp = new ArrayList<>();
		for (Shape s : shapes)
			if (!(s instanceof TriangleT))
				temp.add(s);
		shapes = temp;
	}

	public void drawShape() {
		for (Shape s : shapes)
			s.draw();
	}

	public void deleteCircle() {
		ArrayList<Shape> temp = new ArrayList<>();
		for (Shape s : shapes)
			if (!(s instanceof CircleT) || (s instanceof HexagonT))
				temp.add(s);
		shapes = temp;
	}

	public void addElementToListView(ObservableList<String> elementsShape) {
		for (Shape s : shapes) {
			if (s instanceof HexagonT) {
				Controller.countHexagon++;
				elementsShape.add("Hexagon" + Controller.countHexagon);
			} else if (s instanceof SquareT) {
				Controller.countSquare++;
				elementsShape.add("Square" + Controller.countSquare);
			} else if (s instanceof TriangleT) {
				Controller.countTriangle++;
				elementsShape.add("Triangle" + Controller.countTriangle);
			} else if (s instanceof RectangleT) {
				Controller.countRectangle++;
				elementsShape.add("Rectangle" + Controller.countRectangle);
			} else if (s instanceof CircleT) {
				Controller.countCircle++;
				elementsShape.add("Circle" + Controller.countCircle);
			}
		}
	}

	public void print() {
		for (Shape s : shapes)
			System.out.println(s + " " + s.x + " " + s.y);
		System.out.println("----------------------------------");
	}

	public void change(int index, Shape shape) {
		shapes.remove(index);
		shapes.add(index, shape);
	}

	public boolean compare(Shape shape1, Shape shape2)
	{
		if (shape1.getClass() == shape2.getClass())
		{
			if (shape1 instanceof HexagonT) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)&& (((HexagonT) shape1).radius == ((HexagonT) shape2).radius) ;
			} else if (shape1 instanceof SquareT) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)&& (((SquareT) shape1).width == ((SquareT) shape2).width) ;
			} else if (shape1 instanceof TriangleT) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)
						&& (((TriangleT) shape1).x1 == ((TriangleT) shape2).x1)
						&& (((TriangleT) shape1).y1 == ((TriangleT) shape2).y1)
						&& (((TriangleT) shape1).x2 == ((TriangleT) shape2).x2)
						&& (((TriangleT) shape1).y2 == ((TriangleT) shape2).y2 );
			} else if (shape1 instanceof RectangleT) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)
						&& (((RectangleT) shape1).width == ((RectangleT) shape2).width
						&& (((RectangleT) shape1).length == ((RectangleT) shape2).length)) ;
			} else if (shape1 instanceof CircleT) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)&& (((CircleT) shape1).radius == ((CircleT) shape2).radius) ;
			}
		}
		return false;
	}

	public void deleteDuplicate() {
		ArrayList<Shape> temp = new ArrayList<>();
		if (shapes.size() > 0)
			temp.add(shapes.get(0));
		for (int i = 1; i < shapes.size(); i++)
			for (int j = 0; j < temp.size(); j++) {
				if (!compare(shapes.get(i), temp.get(j)))
					temp.add(shapes.get(i));
			}
		shapes = temp;
	}
}
