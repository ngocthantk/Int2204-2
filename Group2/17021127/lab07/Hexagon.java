package lab7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;

public class Hexagon extends Shape {
	
	private int radius = 0;
	
	public int getRadius() {
		return radius;
	}

	public void setSizeHex(int size) {
		this.radius = size;
	}

	public Hexagon(int _x, int _y, int _size) {
		super(_x, _y); // hexagon tam x,y
		radius = _size;
	}
	
	public Polygon createHexagon() {
		Polygon p = new Polygon();
		for (int i = 0; i < 6; i++)
          p.addPoint((int) (x + radius * Math.cos(i * 2 * Math.PI / 6D)),
            (int) (y +radius  * Math.sin(i * 2 * Math.PI / 6D))); 
		return p;
	}

	@Override
	public boolean isSame(Shape temp) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
