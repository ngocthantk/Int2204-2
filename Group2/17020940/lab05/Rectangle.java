package lab;

public class Rectangle extends Shape {
	  protected double width;
	  protected double length;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double width, double length) {
		this.length= length;
		this.width=width;
	}
	public Rectangle(double width, double length,String color,boolean filled)
	{
		super(color,filled);
		this.length=length;
		this.width=width;
		
	}
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
	public double getArea()
	{
		return width*length;
	}
	public double getPerimeter()
	{
		return 2*(length+width);
	}
	public String toString() {
		String s;
		//Rectangle ci=new Rectangle();
		
		double ar=this.getArea();
		double pe=this.getPerimeter();
		
		s="Rectangle"+"   "+ar+"   "+pe+"	"+color+"	"+filled;
		return s;

	}
	  

}
