package lap07;

public class Triangle extends Shape{
	private Point top1;
	private Point top2;
	private Point top3;
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
	public Triangle(double x1,double y1,double x2,double y2,double x3,double y3) {
		this.top1 = new Point(x1,y1);
		this.top2 = new Point(x2,y2);
		this.top3 = new Point(x3,y3);
	}
	public Triangle(String color) {
		super(color);
	}
	@Override
	public boolean check() {
		if(top1==top2 || top2==top3 || top3==top1) {
			return false;
		}
		return true;
	}
	@Override
	public void move(double a, double b) {
		// TODO Auto-generated method stub
		top1.moveP(a, b);
		top2.moveP(a, b);
		top3.moveP(a, b);
		
	}
}
