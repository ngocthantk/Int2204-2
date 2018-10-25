package lab7;

import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Shape extends JPanel {
	protected String color;
	protected int x = 0, y = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Shape(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public void color(String _color) {
		color = _color;
	}

	public void moveTo(int _x, int _y) {
		x = _x;
		y = _y;
	}


	public abstract boolean isSame(Shape temp);
}
