package lab6;


public class Circle extends Shape {
	private double radius = 1.0;
	final double PI = 3.14;
	
	public Circle() {}
	 
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius,String color, Location A) {
		super(color, A);
		this.radius = radius;
	}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSize() {
        return(PI*this.radius*this.radius);
    }
    
    public String toString() {
    	return "Circle ";
    }
}
