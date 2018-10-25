package lab7;

import java.awt.Graphics;

public class Triangle extends Shape{
	protected int x1 , y1, x2, y2;

	public Triangle(int _x, int _y,int _x1,  int _y1, int _x2, int _y2 ) {
		super(_x,_y);
		x1 = _x1;
		x2 = _x2;
		y1 = _y1;
		y2 = _y2;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public boolean isSame(Shape temp) {
		Triangle c1 = (Triangle) temp;
		if (c1.getX() == x && c1.getY() == y && c1.getX1() == x1
				&& c1.getY1() == y1 && c1.getX2() == x2 && c1.getY2() == y2)
			return true;
	return false;
		
	}
	
}
