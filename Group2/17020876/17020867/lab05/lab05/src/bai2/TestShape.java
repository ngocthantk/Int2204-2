package bai2;
public class TestShape {
	public static void main(String[] args) {
		Square a =new Square(15,"den",true);
		a.setLength(5);
		a.setLength(6);
		System.out.println(a.toString());
		Circle b =new Circle(15);
		System.out.println(b.toString());
		Rectangle c =new Rectangle(10,15,"black",false);
		System.out.println(c.toString());
		Shape d =new Shape("black",false);
		System.out.println(d.toString());
	}

}

