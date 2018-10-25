package bai2;

import java.awt.Graphics;

public class Circle extends Shape {
	 protected int r;
	 protected Point heart;
	public double getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public Point getHeart() {
		return heart;
	}
	public void setHeart(int a,int b) {
		this.heart = new Point(a, b);
	}
	public  Circle(int x,int  y,int r,boolean visible)
	{
		super(visible);
		this.r=r;
		this.heart=new Point(x, y);
		//g.drawOval(x, y, r, r);
		
		
	}
	public String toString()
	{
		return "Cicle";
	}
	public void draw(Graphics g)
	{
		g.drawOval(heart.getX(), heart.getY(), r, r);
	}
//	public Circle(String color) {
//		super(color);
//	}
//	public boolean check()
//	{
//		if(r!=0)
//		{
//			return true;
//		}
//		return false;
//		
//	}
//	public void Move(double a,double b)
//	{
//		heart.Move(a, b);
//	}

	 
	

}
