package bai2;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Shape shape = new Shape();
		Square square = new Square();
		
		square.setSide(10);
		square.setLength(square.getSide());
		double Area = square.getArea();
		double Primeter = square.getPerimeter();
		System.out.println(square.toString() + Area + " " + Primeter);
		
		rectangle.setLength(10);
		rectangle.setWidth(5);
		double Area1 = rectangle.getArea();
		System.out.println(rectangle.toString() + "area = " + Area);
	}

}
