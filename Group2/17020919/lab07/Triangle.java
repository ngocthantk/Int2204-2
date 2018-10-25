package bai2;

import java.awt.Graphics;

public class Triangle extends Shape {
	private Point top1;
	private Point top2;
	private Point top3;
	public Point getTop1() {
		return top1;
	}
	public void setTop1(int a,int b) {
		this.top1 = new Point(a, b);
	}
	public Point getTop2() {
		return top2;
	}

		
	public void setTop2(int a,int b) {
		this.top2 = new Point(a, b);
	}
	public Point getTop3() {
		return top3;
	}
	public void setTop3(int a,int b) {
		this.top3 = new Point(a, b);
	}
	public Triangle(int x1,int y1,int x2,int y2,int x3,int y3,boolean visible)
	{
		super(visible);
		top1=new Point(x1, y1);
		top2=new Point(x2, y2);
		top3=new Point(x3, y3);
	
		
	}
	public String toString()
	{
		return "Triangle";
	}
	public void draw(Graphics g)
	{
		int x1=top1.getX();
		int y1=top1.getY();
		int x2=top2.getX();
		int y2=top2.getY();
		int x3=top3.getX();
		int y3=top3.getY();
		
		g.drawLine(x1,y1,x2,y2);
		g.drawLine(x1,y1,x3,y3);
		g.drawLine(x2,y2,x3,y3);
	}

	
}
