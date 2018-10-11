package bai2;

public class Main {
	public static void main(String[] args) {
		Shape sh=new Shape("red",true);
		Square ci=new Square(3);
		ci.setSide(8);
		Rectangle re=new Rectangle(3,2);
		
		System.out.println(ci.toString());
	}

}
