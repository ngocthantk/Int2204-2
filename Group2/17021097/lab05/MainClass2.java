package tu.phamanh2;

public class MainClass2 {


	public static void main(String[] args) 
	{
		Cricle c = new Cricle(1.0,"red", true);
		System.out.println("Chu vi = " + c.getArea());
		System.out.println("Dien tich = " + c.getPerimeter());
		
		Rectangle r = new Rectangle(3,4,"red",true);
		System.out.println("Chu vi = " + r.getArea());
		System.out.println("Dien tich = " + r.getPerimeter());
		
		Square s = new Square(6,"red",true);
		s.setSize(6.0);
		System.out.println("Chu vi = " + s.getArea());
		System.out.println("Dien tich = " + s.getPerimeter());
	}
}
