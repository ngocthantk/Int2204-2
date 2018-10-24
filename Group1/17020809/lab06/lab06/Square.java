/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author win
 */
public class Square extends Rectangle {
    public Square() {
		super();
	}
	public Square(double side) {
		super(side, side);
	}
	
	public void setSide(double side) {
		super.width=side;
		super.length=side;
	}
	
	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	@Override
	public void setLength(double side) {
		setSide(side);
	}
        @Override
	public void move(double x, double y) {
		super.x0 = x;
		super.y0 = y;
	}
	@Override
	public String toString() {
		return "Square";
	}

}
