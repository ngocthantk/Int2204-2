package lab06;

public class Square extends Rectangle{
	public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	public Square(String color) {
		super(color);
	}
	@Override
	public boolean check() {
		double a = top1.distance(top2);
		double b = top1.distance(top3);
		double c = top1.distance(top4);
		if(top1.rightAngle(top2, top4) && top2.rightAngle(top1, top3)
				&& top3.rightAngle(top2, top4) && a==c) {
			return true;
		}
		if(top1.rightAngle(top2, top3) && top2.rightAngle(top1, top4)
				&& top3.rightAngle(top1, top4) && a==b) {
			return true;
		}
		if(top1.rightAngle(top3, top4) && top2.rightAngle(top3, top4)
				&& top3.rightAngle(top2, top1) && b==c) {
			return true;
		}
		return false;
	}
	@Override
	public void move(double a, double b) {
		// TODO Auto-generated method stub
			top1.moveP(a, b);
			top2.moveP(a, b);
			top3.moveP(a, b);
			top4.moveP(a, b);
	}
}
