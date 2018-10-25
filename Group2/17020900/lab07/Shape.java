package minh.dim;

import java.awt.Graphics;



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
	
	public abstract void add(int x, int y);
	public void drawShape(Graphics graphics) {
		if(this instanceof Circle) {
			Circle circle = (Circle) this;
			graphics.drawOval(circle.x[0], circle.y[0], circle.Rad, circle.Rad);
		}else if(this instanceof Triangle){
			graphics.drawPolygon(this.x,this.y, this.n);
		}else if(this instanceof Retangle) {
			graphics.drawPolygon(this.x,this.y, this.n);
		}else if(this instanceof Square) {
			graphics.drawPolygon(this.x,this.y, this.n);
		}else if(this instanceof Hexagon) {
			graphics.drawPolygon(this.x,this.y, this.n);
		}
	}
}
