package lab7;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	protected int radian;
	public final double PI = Math.PI;
	public Circle( int _x, int _y, int radian) {		
		super(_x, _y);	// hinh tron tam x,y
		this.radian = radian;
	}

	public int getRadian() {
		return radian;
	}
	public void setRadian(int radian) {
		this.radian = radian;
	}
	@Override
	public boolean isSame(Shape temp) {
		Circle c1 = (Circle) temp;
		if (c1.getRadian() == radian && c1.getX() == x && c1.getY() == y)
			return true;
		return false;
		
	}
}
