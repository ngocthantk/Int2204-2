package lap05_2;

public class TestCT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(2);
		System.out.println("Thong so: " + c.toString());
		System.out.println("Dien tich: " + c.getArea() + " ChuVi: " + c.getPerimeter());
		Rectangle r = new Rectangle(8, 9);
		System.out.println("Thong so: " + r.toString());
		System.out.println("Dien tich: " + r.getArea() + " ChuVi: " + r.getPerimeter());
		Square s = new Square(6);
		System.out.println("Thong so: " + s.toString());
		System.out.println("Dien tich: " + s.getArea() + " ChuVi: " + s.getPerimeter());
	}

}
