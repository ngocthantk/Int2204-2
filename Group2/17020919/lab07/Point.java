package bai2;

public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void Move(int a,int b)
	{
		this.x+=a;
		this.y+=b;
	}
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
//	public double distance(Point A)
//	{
//		double a=((this.x-A.getX())*(this.x-A.getX()));
//		double b=((this.y-A.getY())*(this.y-A.getY()));
//		return Math.sqrt(a+b);
//	}
//	public boolean kt(Point A,Point B)
//	{
//		double a=(this.x-A.getX())*(this.x-B.getX());
//		double b=(this.y-A.getY())*(this.y-B.getY());
//		if(a+b==0)
//		{
//			return true;
//		}
//		return false;
//	}

}
