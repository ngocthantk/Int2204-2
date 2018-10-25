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
public class Rectangle extends Shape {
    protected double width;
	protected double length;	
	public Rectangle() {}	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	} 
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public void size() {	
		System.out.println(width*length);
	}

	@Override
	public void move(double x, double y) {
		super.x0 = x;
		super.y0 = y;
	}
	@Override
	public String toString() {
		return "Rectangle";
	}
}
