package lab06; 

public abstract class Shape{
	protected String color;
	protected double x;
	protected double y;
	public Shape() {
		
	}
	public Shape(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public abstract void size();
	public abstract void move(double x, double y);

}

