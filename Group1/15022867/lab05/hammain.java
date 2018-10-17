package Bai2;

public class hammain {
	public static void main(String args[]) {
		Shape thao = new Shape();
		System.out.println(thao.toString());
		Circle thao1 = new Circle(2,"tim",true);
		System.out.println(thao1.toString());
		Rectangle thao2 = new Rectangle(3,4);
		System.out.println(thao2.toString());
		Square thao3 = new Square();
		System.out.println(thao3.toString());
		System.out.println(thao3.getArea());
		System.out.println(thao3.getPerimeter());
		
	}
}
