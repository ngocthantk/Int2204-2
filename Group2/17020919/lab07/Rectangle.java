package bai2;

import java.awt.Graphics;

public class Rectangle extends Shape {
	  protected Point top1;
	  protected int weight;
	  protected int high;
	public Point getTop1() {
		return top1;
	}
	public void setTop1(int x,int y) {
		this.top1 = new Point(x, y);
	}
	
    public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public void setTop1(Point top1) {
		this.top1 = top1;
	}
	public Rectangle (int x1,int y1,int weight,int high,boolean visible) {
		super(visible);
    	this.top1 = new Point(x1, y1);
    	this.high=high;
    	this.weight=weight;
    	  //g.drawRect(x1, y1,weight, high);  
//          g.drawRect(x1, y1, weight, high);   	
          
    }
	public String toString()
	{
		return "Rectangle";
	}
	public void draw(Graphics g)
	{
		 g.drawRect(top1.getX(), top1.getY(), weight, high); 
	}
    public Rectangle (String color)
    {
    	super(color);
    }
//	public boolean check()
//	{
//		if(top1.kt(top2, top4)&&top2.kt(top1, top3)&&top3.kt(top2, top4))
//		{
//			return true;
//		}
//		return false;
//	}
//	public void Move(double a,double b)
//	{
//		top1.Move(a, b);
//		top2.Move(a, b);
//		top3.Move(a, b);
//		top4.Move(a, b);
//		
//	}

}
