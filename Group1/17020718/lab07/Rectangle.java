package lap07;

public class Rectangle extends Shape{
	protected Point top1;
	protected Point top2;
	protected Point top3;
	protected Point top4;
	public Point getTop1() {
		return top1;
	}
	public void setTop1(double x,double y) {
		this.top1 = new Point(x,y);
	}
	public Point getTop2() {
		return top2;
	}
	public void setTop2(double x,double y) {
		this.top2 = new Point(x,y);
	}
	public Point getTop3() {
		return top3;
	}
	public void setTop3(double x,double y) {
		this.top3 = new Point(x,y);
	}
	public Point getTop4() {
		return top4;
	}
	public void setTop4(double x,double y) {
		this.top4 = new Point(x,y);
	}
	public Rectangle(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4) {
		this.top1 = new Point(x1,y1);
		this.top2 = new Point(x2,y2);
		this.top3 = new Point(x3,y3);
		this.top4 = new Point(x4,y4);
	}
	public Rectangle(String color) {
		super(color);
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
