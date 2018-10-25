package Diagram;

import java.awt.Graphics;

public abstract class Shape {
	protected ToaDo point;
	protected int[] x;
	protected int[] y;
	protected int n;
    
	public Shape() {}
    
    public Shape(int n){
        this.n = n;
        this.x = new int[this.n];
        this.y = new int[this.n];
    }
    
    public Shape(ToaDo O) {
    	this.point = O;
	}
    
// get thuoc tinh   
    public ToaDo getPoint() {
    	return point;
    }
 
// set thuoc tinh  
    public ToaDo setPoint(ToaDo O) {
        return this.point = O;
    }
    
    public String toString() {
        return "Shape";
    }

	public abstract void move(int x, int y);

	public void drawShape(Graphics g) {
		if(this instanceof Circle) {
			Circle c = (Circle) this;
			g.drawOval(c.getPoint().getX(), c.getPoint().getY(), (int) c.getRadius(), (int) c.getRadius());
		}
		else if(this instanceof Triangle){
			g.drawPolygon(this.x,this.y, this.n);
		}
		else if(this instanceof Rectangle) {
			Rectangle r = (Rectangle) this;
			g.drawRect(r.getPoint().getX(), r.getPoint().getY(), (int)r.getWidth(), (int)r.getLength());
		}
		else if(this instanceof Square) {
			Square s = (Square) this;
			g.drawRect(s.getPoint().getX(), s.getPoint().getY(), (int)s.getWidth(), (int)s.getLength());;
		}
		else if(this instanceof Hexagon) {
			g.drawPolygon(this.x,this.y, this.n);
		}
		
	}
}
