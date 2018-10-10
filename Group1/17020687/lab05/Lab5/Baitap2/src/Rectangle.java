/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class Rectangle extends Shape {
	double width;
	double length;
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double width, double length,String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
		// TODO Auto-generated constructor stub
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
	// Dien tich hinh chu nhat
	public double area()
	{
		double a;
		a=width*length;
		return a;
	}
	// Chu vi hinh chu nhat
	public double perimeter()
	{
		double p;
		p=2*(width+length);
		return p;
	}
	
}
