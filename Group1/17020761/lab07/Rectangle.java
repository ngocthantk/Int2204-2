package lab06;

public class Rectangle extends Shape{
	protected point top1;
	protected point top2;
	protected point top3;
	protected point top4;
	public point getTop1() {
		return top1;
	}
	public void setTop1(double x,double y) {
		this.top1 = new point(x,y);
	}
	public point getTop2() {
		return top2;
	}
	public void setTop2(double x,double y) {
		this.top2 = new point(x,y);
	}
	public point getTop3() {
		return top3;
	}
	public void setTop3(double x,double y) {
		this.top3 = new point(x,y);
	}
	public point getTop4() {
		return top4;
	}
	public void setTop4(double x,double y) {
		this.top4 = new point(x,y);
	}
	public Rectangle(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4) {
		this.top1 = new point(x1,y1);
		this.top2 = new point(x2,y2);
		this.top3 = new point(x3,y3);
		this.top4 = new point(x4,y4);
	}
	public Rectangle(String color) {
		super(color);
	}
	@Override
	public boolean equals(Object a) {
		if(a instanceof Rectangle && this.top1 == ((Rectangle) a).getTop1() 
			&& this.top2 == ((Rectangle) a).getTop2() && this.top3 == ((Rectangle) a).getTop3()
					&& this.top4 == ((Rectangle) a).getTop4()
				) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean check() {
		double a = top1.distance(top2);
		double b = top1.distance(top3);
		double c = top1.distance(top4);
		if(top1.rightAngle(top2, top4) && top2.rightAngle(top1, top3)
				&& top3.rightAngle(top2, top4) && a!=c) {
			return true;
		}
		if(top1.rightAngle(top2, top3) && top2.rightAngle(top1, top4)
				&& top3.rightAngle(top1, top4) && a!=b) {
			return true;
		}
		if(top1.rightAngle(top3, top4) && top2.rightAngle(top3, top4)
				&& top3.rightAngle(top2, top1) && b!=c) {
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
