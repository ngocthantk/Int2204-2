package lab7;

import java.awt.Graphics;

public class Square extends Retangle {

	protected int size = 0;
	@Override
	public int getWidth() {
		return size;
	}

	@Override
	public void setWidth(int _width) {
		width = _width;
		length = _width;
		this.size = _width;
	}

	@Override
	public int getLength() {
		return size;
	}

	@Override
	public void setLength(int _length) {
		width = _length;
		length = _length;
		this.size = _length;
	}


	public Square(int _x, int _y, int _size) {
		super(_x, _y, _size, _size);
		size = _size;

	}

	public int getSizeSqr() {
		return size;
	}

	public void setSizeSqr(int size) {
		this.size = size;
	}
	@Override
	public boolean isSame(Shape temp) {
		Square re = (Square) temp;
		if (x == re.getX() && y == re.getY() && width == re.getWidth() && length == re.getLength()) 
			return true;
		return false;
		
		
	}
}
