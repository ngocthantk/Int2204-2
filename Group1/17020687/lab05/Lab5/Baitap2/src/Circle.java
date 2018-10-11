/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class Circle extends Shape{
	double radius;
        private final double pi;
	
	public Circle() {
		super();
                this.pi = 3.14;
	}

	public Circle(double radius ,String color, boolean filled) {
		super(color, filled);
                this.pi = 3.14;
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
                this.pi = 3.14;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//Dien tich hinh tron
	public double Area()
	{
		double a;
		a=radius*pi*radius;
		return a;
	}
	// chu vi hinh tron
	public double Perimeter()
	{
		double p;
		p=2*pi*radius;
		return p;
	}
	
}

