package lab07;
 import java.util.ArrayList;
 
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
			if (!(s instanceof Triangles))
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
			if (!(s instanceof Circles) || (s instanceof Hexagons))
				temp.add(s);
		shapes = temp;
	}

 	public void print() {
		for (Shape s : shapes)
			System.out.println(s);
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
			if (shape1 instanceof Hexagons) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)&& (((Hexagons) shape1).radius == ((Hexagons) shape2).radius) ;
			} else if (shape1 instanceof Squares) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)&& (((Squares) shape1).width == ((Squares) shape2).width) ;
			} else if (shape1 instanceof Triangles) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)
						&& (((Triangles) shape1).x1 == ((Triangles) shape2).x1)
						&& (((Triangles) shape1).y1 == ((Triangles) shape2).y1)
						&& (((Triangles) shape1).x2 == ((Triangles) shape2).x2)
						&& (((Triangles) shape1).y2 == ((Triangles) shape2).y2 );
			} else if (shape1 instanceof Rectangles) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)
						&& (((Rectangles) shape1).width == ((Rectangles) shape2).width
						&& (((Rectangles) shape1).length == ((Rectangles) shape2).length)) ;
			} else if (shape1 instanceof Circles) {
				return (shape1.x == shape2.x) && (shape1.y == shape2.y)&& (((Circles) shape1).radius == ((Circles) shape2).radius) ;
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