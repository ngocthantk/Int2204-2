package Tuan06;

public class Circle extends Shape {
	private final double PI = Math.PI;
	double radius;

	public Circle() {}
	public Circle(double radius) {
		this.radius = radius;
	}	

	public int getRadius() {
		return(int) radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Name: Circle\n" + "Move: " + canMove + "\nFilled: " + filled + "\nRadius: " + radius;
	}
	@Override
	public void move(int x, int y) {
		super.x=x;
		super.y=y;
	}

}
