public class Circle extends Shape{
	protected double radius = 1.0;
	private double pi = 3.1415;
	
	public Circle(){
		super();
	}
	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return radius*radius*pi;
	}
	public double getPerimeter(){
		return radius*2*pi;
	}
	public String toString(){
		return null;
	}
}
