package lab06;

public abstract class Shape {

	protected String color = "white";
	protected double x = 0,y = 0;
	
	// constructors
	public Shape() {}

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract void draw();
	public abstract void erase();
	
	public void paintShape(String color)
	{
		this.color = color;
	}
	
	public void moveShapeTo(double x, double y)
	{
		erase();
		this.x = x;
		this.y = y;
		draw();
	}
}
