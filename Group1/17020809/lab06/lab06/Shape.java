/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

public abstract class Shape {
	protected String color;
	protected double x0; 
	protected double y0;
	
	public Shape() {}
	public Shape(double x0, double y0) {
		this.x0 = x0;
		this.y0 = y0;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void size() {}
	public void move(double x, double y) {}
}
