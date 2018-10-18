package lab06;

public class Main {
	public static void main(String[] args) {
		Diagram dia = new Diagram();
			Layer layer1 = new Layer();
				Shape square = new Square(1,1,1,2,1);
				Shape triangle = new Triangle(4,5,4, 3, 5, 5);
				Shape rectangle = new Rectangle(1, 2,1,0);
				Shape circle1 = new Circle(2, 4, 5);
			layer1.add(square);
			layer1.add(triangle);
			layer1.add(rectangle);
			layer1.add(circle1);
		System.out.println("Before delete triangles : ");
			layer1.print();
		System.out.println("---------------------------------------------");
			layer1.deleteTriangle();
			System.out.println("After delete triangle : ");
			layer1.print();
		System.out.println("---------------------------------------------");
			Layer layer2 = new Layer();
				Shape circle2 = new Circle(5);
				Shape circle3 = new Circle(10, 3, 4);
				Shape circle4 = new Circle(5, 1, 1);
			layer2.add(circle2);
			layer2.add(circle3);
			layer2.add(circle4);
		dia.add(layer1);
		dia.add(layer2);
		System.out.println("Before delete all circles : ");
		dia.print();
		System.out.println("---------------------------------------------");
		dia.deleteAllCircle();
		System.out.println("After delete all circles : ");
		dia.print();
//		System.out.println("---------------------------------------------");
//		rectangle.moveShapeTo(2, 3);
//		System.out.println(rectangle);
	}
}
