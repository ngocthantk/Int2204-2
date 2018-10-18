package lab06;

public class Square extends Rectangle{
	public Square (double x1 , double y1, double x2, double y2, double x3, double y3,double x4,double y4) {
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	public Square(String color ) {
		super(color);
	}
	public boolean check() {
		double a = p1.distance(p2);
		double b = p1.distance(p3);
		double c = p1.distance(p4);
		if (p1.rightAngle(p2, p4) && p2.rightAngle(p1, p3) && p3.rightAngle(p2, p4) && a==c) return true;
		if (p1.rightAngle(p2, p3) && p2.rightAngle(p1, p4) && p3.rightAngle(p1, p4) && a==b) return true;
		if (p1.rightAngle(p3, p4) && p2.rightAngle(p3, p4) && p3.rightAngle(p2, p1) && b==c) return true;
		return false ;
	}
	public void move (double a , double b) {
		p1.Move(a, b);
		p2.Move(a, b);
		p3.Move(a, b);
		p4.Move(a, b);
	}
}
