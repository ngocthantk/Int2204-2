package tu.phamanh2;

public class Cricle extends Shape
{
	public double radius;

	public Cricle() 
	{
		super();
	}
	public Cricle(double radius)
	{
		this.radius = radius;
	}
	public Cricle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() 
	{
		return radius;
	}
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return 2*PI*radius;
	}
	public double getPerimeter()
	{
		return PI*radius*radius;
	}
	public String toString() {
		return "Cricle [radius=" + radius + "]";
	}
	
}
	