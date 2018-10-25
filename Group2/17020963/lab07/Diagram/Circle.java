package Diagram;

import java.awt.Color;

public class Circle extends Shape {
	private double radius = 1.0;
	final double PI = 3.14;
	
	public Circle() {}
	 
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, ToaDo A) {
		super(A);
		this.radius = radius;
	}
//get radius    
    public double getRadius() {
        return radius;
    }
//set radius   
    public void setRadius(double radius) {
        this.radius = radius;
    }
//get Size   
    public double getSize() {
        return(PI*this.radius*this.radius);
    }
    
    public String toString() {
    	return "Circle ";
    }

	public boolean sameCircle(Circle c1) {
		if(c1.getRadius() == this.radius && c1.getPoint().equals(this.getPoint()))
			return true;
		return false;
	}

	@Override
	public void move(int x, int y) {
		this.getPoint().setX(this.getPoint().getX()+x);
		this.getPoint().setY(this.getPoint().getY()+y);
		
	}
}
