/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Graphics;

/**
 *
 * @author tuann_000
 */
public class Hexagon extends Shape {
	  private toaDo heart;
	  private int r;
	public toaDo getHeart() {
		return heart;
	}
	public void setHeart(toaDo heart) {
		this.heart = heart;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}

    public Hexagon(toaDo heart, int r, String color) {
        super(color);
        this.heart = heart;
        this.r = r;
    }
	
          @Override
	public void draw(Graphics g)
	{
		int x=heart.getX();
		int y=heart.getY();
		int k=r/2;
		double a=0.866*r;
		int h= (int)a;
		toaDo top4=new toaDo(x+r, y);
		toaDo top1=new toaDo(x-r, y);
		toaDo top2=new toaDo(x-k, y+h);
		toaDo top6=new toaDo(x-k, y-h);
		toaDo top3=new toaDo(x+k, y+h);
		toaDo top5=new toaDo(x+k, y-h);
		g.drawLine(top1.getX(), top1.getY(), top2.getX(), top2.getY());
		g.drawLine(top2.getX(), top2.getY(), top3.getX(), top3.getY());
		g.drawLine(top3.getX(), top3.getY(), top4.getX(), top4.getY());
		g.drawLine(top4.getX(), top4.getY(), top5.getX(), top5.getY());
		g.drawLine(top5.getX(), top5.getY(), top6.getX(), top6.getY());
		g.drawLine(top6.getX(), top6.getY(), top1.getX(), top1.getY());
	}

    @Override
    public void move(int x, int y) {
        heart.setX(x+heart.getX());
        heart.setY(y+heart.getY());
    }

}
