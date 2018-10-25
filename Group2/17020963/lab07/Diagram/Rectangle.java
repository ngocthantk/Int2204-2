package Diagram;

public class Rectangle extends Shape {
	protected double width = 1.0;
	protected double  length = 1.0;
	 
	public Rectangle () {}
	 
	public Rectangle (double width, double length) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle (double width, double length, ToaDo A) {
		super(A);
		this.length = length;
		this.width = width;
	}
//get va set    
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
//get Size
	public double getSize() {
		return (this.getWidth()*this.getLength());
	}
	
	public String toString() {
		return "Rectangle ";
	}

	public boolean sameRetangle(Rectangle c1) {
		if(c1.getPoint().equals(this.point) && c1.getWidth() == this.getWidth() && c1.getLength() == this.getLength())
			return true;
		return false;
	}

	@Override
	public void move(int x, int y) {
		this.getPoint().setX(this.getPoint().getX() + x);
		this.getPoint().setY(this.getPoint().getY() + y);
	}
}
