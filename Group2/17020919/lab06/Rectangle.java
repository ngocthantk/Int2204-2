package bai2;

public class Rectangle extends Shape {
	  protected Point top1;
	  protected Point top2;
	  protected Point top3;
	  protected Point top4;
	public Point getTop1() {
		return top1;
	}
	public void setTop1(double x,double y) {
		this.top1 = new Point(x, y);
	}
	public Point getTop2() {
		return top2;
	}
	public void setTop2(double x,double y) {
		this.top2 = new Point(x, y);
	}
	public Point getTop3() {
		return top3;
	}
	public void setTop3(double x,double y) {
		this.top3 = new Point(x, y);
	}
	public Point getTop4() {
		return top4;
	}
	public void setTop4(double x,double y) {
		this.top4 = new Point(x, y);
	}
    public Rectangle (double x1,double y1,double x2,double y2,double x3,double y3,double x4, double y4) {
    	this.top1 = new Point(x1, y1);
    	this.top2 = new Point(x2, y2);
    	this.top3 = new Point(x3, y3);
    	this.top4 = new Point(x4, y4);
    	
    }
    public Rectangle (String color)
    {
    	super(color);
    }
	public boolean check()
	{
		if(top1.kt(top2, top4)&&top2.kt(top1, top3)&&top3.kt(top2, top4))
		{
			return true;
		}
		return false;
	}
	public void Move(double a,double b)
	{
		top1.Move(a, b);
		top2.Move(a, b);
		top3.Move(a, b);
		top4.Move(a, b);
		
	}
	public String toString(){
		return "Rectangle";
	}

}
