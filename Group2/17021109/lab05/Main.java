package Example2;

public class Main {

	public static void main(String[] args) {
		Circle c = new Circle(1);
		System.out.println("Thong so: " + c.toString());
		System.out.println("Dien tich: " + c.getArea() + " ChuVi: " + c.getPerimeter());
		Rectangle r = new Rectangle(5, 2);
		System.out.println("Thong so: " + r.toString());
		System.out.println("Dien tich: " + r.getArea() + " ChuVi: " + r.getPerimeter());
		Square s = new Square(4);
		System.out.println("Thong so: " + s.toString());
		System.out.println("Dien tich: " + s.getArea() + " ChuVi: " + s.getPerimeter());
	}
}
