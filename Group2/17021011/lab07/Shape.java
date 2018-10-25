package lab07;

public abstract class Shape {

	protected String color;
	protected double x, y;
	
	// Constructor
	public Shape() {}
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();

}
