package bai2;

public class Triangle extends Shape {
	private Point top1;
	private Point top2;
	private Point top3;
	public Point getTop1() {
		return top1;
	}
	public void setTop1(double a,double b) {
		this.top1 = new Point(a, b);
	}
	public Point getTop2() {
		return top2;
	}

		
	public void setTop2(double a,double b) {
		this.top2 = new Point(a, b);
	}
	public Point getTop3() {
		return top3;
	}
	public void setTop3(double a,double b) {
		this.top3 = new Point(a, b);
	}
	public Triangle(double x1,double y1,double x2,double y2,double x3,double y3)
	{
		top1=new Point(x1, y1);
		top2=new Point(x2, y2);
		top1=new Point(x3, y3);
	}
	public boolean check() {
		if(top1.equals(top2)||top1.equals(top3)||top2.equals(top3))
		{
			return true;
		}
		return false;
	}
	public void toString(){
		return "Triangle";
	}
	
}
