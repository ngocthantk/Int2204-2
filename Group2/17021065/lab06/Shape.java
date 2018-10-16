package tuan6;

public abstract class Shape {
	protected String color;

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void size();
	public abstract void move(double x, double y);
}
