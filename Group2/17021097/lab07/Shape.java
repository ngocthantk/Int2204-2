package tu.phamanh;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Shape {
	protected int[] x;
	protected int[] y;
	protected int n;
	protected String color;
	public Shape(int n){
        this.n=n;
        this.x=new int[this.n];
        this.y=new int[this.n];
    }

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void move(int x, int y);
	public void drawShape(Graphics g) {
		if(this instanceof Circle) {
			Circle c = (Circle) this;
			g.drawOval(c.x[0], c.y[0], c.radian, c.radian);
		}else if(this instanceof Triangle){
			g.drawPolygon(this.x,this.y, this.n);
		}else if(this instanceof Retangle) {
			g.drawPolygon(this.x,this.y, this.n);
		}else if(this instanceof Square) {
			g.drawPolygon(this.x,this.y, this.n);
		}else if(this instanceof Hexagon) {
			g.drawPolygon(this.x,this.y, this.n);
		}
	}
}
