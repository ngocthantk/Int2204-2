package lab06;

import java.text.DecimalFormat;

public class Circle extends Shape {
    protected double radius = 0;
    final double pi = Math.PI;

    public Circle() {}   
    
    public Circle(double radius) {
        this.radius = radius;
        this.area = computeArea();
    }
    public Circle(double radius, double x, double y) {
    	super(x,y);
        this.radius = radius;
        this.area = computeArea();
    }

    @Override
	public String toString() {
    	DecimalFormat decimalFormat = new DecimalFormat("#.00");
		return "Circle [radius=" + radius + ", pi=" + decimalFormat.format(pi) + ", color=" + color + ", x=" + x + ", y=" + y + ", area="
				+ decimalFormat.format(area) + "]";
	}

	@Override
    public double computeArea() {
        return pi * Math.pow(radius, 2);
    }
}