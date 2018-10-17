package ex2;

public class Main {
	public static void main(String[] args) {
		Shape S = new Shape();
		Circle C = new Circle(3);
		Rectangle R = new Rectangle(3,4);
		Square Sq = new Square(6);
		System.out.println(S.toString());
		System.out.println(C.toString());
		System.out.println(R.toString());
		System.out.println(Sq.toString());
	}
}
