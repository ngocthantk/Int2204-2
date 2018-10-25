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
public class Circle extends Shape {
    private double r;
	private final double PI = Math.PI;
	
	public Circle() {}
	public Circle(double r) {
		super();
		this.r = r;
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
    @Override
	public void size() {
		System.out.println(r*r*PI);
	}

    @Override
	public void move(double x, double y) {
		super.x0=x;
		super.y0=y;
	}
    @Override
	public String toString() {
		return "Circle";
	}
}
