package lab05;

public class Retangle extends Shape{
	protected double wight = 1.0;
	protected double length = 1.0;
	public Retangle(double width, double length) {
		setWidth(width);
		setLength(length);
	}
	public Retangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		setWidth(width);
		setLength(length);
	}
	public double getWidth() {
		return wight;
	}
	public void setWidth(double width) {
		this.wight = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return wight*length;
	}
	public double getPerimeter() {
		return (wight + length)*2;
	}
	public String toString() {
		return ("Color: "+getColor()+"\nfilled:"+isFilled()+"\nArea: "+ getArea()+"\nPerimeter: "+getPerimeter());
	}
	public static void main(String[] args) {
    	Retangle retangle = new Retangle("Green",true, 5, 10);
    	System.out.print(retangle.toString());
	}
}