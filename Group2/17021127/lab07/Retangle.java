package lab7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Retangle extends Shape {

	protected int width  = 0, length = 0;
	

	public Retangle(int _x, int _y, int _width, int _length) {
		super(_x, _y);
		width = _width;
		length = _length;
	}
	

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public void moveTo(int _x, int _y) {

		x = _x;
		y = _y;

	}
	@Override
	public boolean isSame(Shape temp) {
		Retangle re = (Retangle) temp;
		if (x == re.getX() && y == re.getY() && width == re.getWidth() && length == re.getLength()) 
			return true;
		return false;
		
		
	}

	
}
