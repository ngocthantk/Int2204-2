package lab;

public class Main2 {
	public static void main(String[] args) {
		Square s = new Square(10);
		s.setLength(3);
		System.out.println(s.toString());
		Rectangle r = new Rectangle(4, 5);
		System.out.println(r.toString());
		Circle c = new Circle(5);
		System.out.println(c.toString());
	}

}
