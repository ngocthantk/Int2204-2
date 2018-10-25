package dỉagram;


public class Retangle extends Shape {
	protected double width = 1.0;
	protected double  length = 1.0;
	 
	public Retangle () {}
	 
	public Retangle (double width, double length) {
		this.length =length;
		this.width = width;
	}
	
	public Retangle (double width, double length, String color, ToaDo A) {
		super(color, A);
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
}
