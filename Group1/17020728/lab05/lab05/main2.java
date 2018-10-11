package lab05;

public class main2 {

	public static void main (String[]arg) {
		
		shape Shape = new shape();
		Shape.setColor("red");
		Shape.setFilled(true);
		
		circle Circle =new circle();
		Circle.setRadius(1.0);
		Circle.setShape(Shape);
		
		rectangle Rectangle =new rectangle();
		Rectangle.setLenght(1.0);
		Rectangle.setLenght(1.0);
		Rectangle.setShape(Shape);
		
		//System.out.println(Shape.toString());
		System.out.println(Circle.toString());
		System.out.println(Rectangle.toString());
	System.out.println("dien tich va chu vi hinh tron lan luot la "+ Circle.getPerimeter()+"  "+Circle.getArea());
	
	
	}
}
