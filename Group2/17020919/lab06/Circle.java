package bai2;

public class Circle extends Shape {
	 protected double r;
	 protected Point heart;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Point getHeart() {
		return heart;
	}
	public void setHeart(double a,double b) {
		this.heart = new Point(a, b);
	}
	public void Circle(double r,double x,double y)
	{
		this.r=r;
		this.heart=new Point(x, y);
		
	}
	public Circle(String color) {
		super(color);
	}
	public boolean check()
	{
		if(r!=0)
		{
			return true;
		}
		return false;
		
	}
	public void Move(double a,double b)
	{
		heart.Move(a, b);
	}

	 
	

}
