package lab6;

public class Main {

	public static void main(String[] args) {
		Diagram x = new Diagram();

		Layer s = new Layer();
		s.addShape("Square");
		Location O = new Location(0,0);
		s.layer.add(new Square(2, "red", O));
		s.layer.add(new Triangle(0, 0, 1, 1, -1, 1));
		s.layer.add(new Circle(1, "red", new Location(2, 2)));
		s.layer.add(new Rectangle(2, 3, "red", new Location(3, 3)));
		x.diagram.add(s);

		for(Shape shape : Layer.layer) {
			System.out.println(shape.toString());
		}

		s.deleteTriangle();
		for(Shape shape : Layer.layer) {
			System.out.println(shape.toString());
		}
		System.out.println();

		x.deleteCircle();
		for(Shape shape : Layer.layer) {
			System.out.println(shape.toString());
		}
		
	}


}
