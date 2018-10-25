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
public class Triangle extends Shape {
        private double a;
	private double d;
	private double h;
	public Triangle() {
		
	}
	public Triangle(double a, double d, double h) {
		super();
		this.a = a;
		this.d = d;
		this.h = h;
	}
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	@Override
	public void size() {
			System.out.println(h*d/2);	
	}
	@Override
	public void move(double x, double y) {
		super.x0 = x;
		super.y0 = y;
	}
	@Override
	public String toString() {
		return "Triangle";
	}
	
}
