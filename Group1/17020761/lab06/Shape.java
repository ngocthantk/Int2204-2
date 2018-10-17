package lab06;

public abstract class Shape {
	protected String shapeName; 
	protected String color;
	protected double xMove;
	protected double yMove;
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	public double getxMove() {
		return xMove;
	}
	public void setxMove(double xMove) {
		this.xMove = xMove;
	}
	public double getyMove() {
		return yMove;
	}
	public void setyMove(double yMove) {
		this.yMove = yMove;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Shape() {
		
	}
	public Shape(String s,double x , double y) {
		this.color = s;
		this.xMove = x;
		this.yMove = y;
	}
	public Shape(String s) {
		this.color = s;
	}
	public Shape(double x , double y) {
		this.xMove = x;
		this.yMove = y;
	}
	public boolean check() {
		return true;
	}
	public abstract void move(double a,double b);
}
