package lab052;

public class Main {
	public static void main(String[] args) {
		Square s = new Square(5);
		System.out.println(s.toString());
		System.out.println("==========");
		Circle c = new Circle(1);
		System.out.println(c.toString());
		System.out.println("==========");
		Rectangle r = new Rectangle(2, 4, "blue", false);
		System.out.println(r.toString());
	}
}
