package Cau2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle= new Circle(2);
		System.out.println("Thong So: "+circle.toString());
		System.out.println("Area Circle: "+circle.getArea()+"\n"+"Perimeter Circle: "+circle.getPerimeter());
		Rectangle R=new Rectangle(2,3);
		System.out.println("Thong So: "+R.toString());
		System.out.println("Area Rectangle: "+R.getArea()+"\n"+"Perimeter Rectangle: "+R.getPeremeter());
		Square S= new Square(3);
		System.out.println("Thong So: "+S.toString());
		System.out.println("Area Square: "+S.getArea()+"\n"+"Perimeter Square: "+S.getPeremeter());
	}

}
