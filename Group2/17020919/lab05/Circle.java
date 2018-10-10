package bai2;

public class Circle extends Shape {
	 private double radius;

	 
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(double radius) {
		
		this.radius=radius;
	}

	public Circle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius,String color,boolean filled )
	{
		super(color,filled);
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	 
	public  double getArea()
	{
		return radius*radius*Math.PI;
	}
	public  double getPerimeter()
	{
		return 2*radius*Math.PI;
	}
	public String toString() {
		//Circle ci=new Circle();
		String s;
		double ar=this.getArea();
		double pe=this.getPerimeter();
		
		s="Circle"+"   "+ar+"   "+pe;
		return s;
		
	}

}
