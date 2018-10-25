package bai2;

import java.awt.Graphics;

public class Hexagon extends Shape {
	  private Point heart;
	  private int r;
	public Point getHeart() {
		return heart;
	}
	public void setHeart(Point heart) {
		this.heart = heart;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public Hexagon(int x1,int y1,int r,boolean kt)
	{
		super(kt);
		this.heart=new Point(x1, y1);
		this.r=r;
	}
	public void draw(Graphics g)
	{
		int x=heart.getX();
		int y=heart.getY();
		int k=r/2;
		double a=0.866*r;
		int h= (int)a;
		Point top4=new Point(x+r, y);
		Point top1=new Point(x-r, y);
		Point top2=new Point(x-k, y+h);
		Point top6=new Point(x-k, y-h);
		Point top3=new Point(x+k, y+h);
		Point top5=new Point(x+k, y-h);
		g.drawLine(top1.getX(), top1.getY(), top2.getX(), top2.getY());
		g.drawLine(top2.getX(), top2.getY(), top3.getX(), top3.getY());
		g.drawLine(top3.getX(), top3.getY(), top4.getX(), top4.getY());
		g.drawLine(top4.getX(), top4.getY(), top5.getX(), top5.getY());
		g.drawLine(top5.getX(), top5.getY(), top6.getX(), top6.getY());
		g.drawLine(top6.getX(), top6.getY(), top1.getX(), top1.getY());
	}

}
