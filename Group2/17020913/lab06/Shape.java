package Tuan06;

public abstract class Shape {
	protected double x,y;
	protected boolean filled;
	protected boolean canMove;
	
	// Constructor
	public Shape() {}
	public Shape(double x, double y) 
	{
		super();
		this.x=x;
		this.y=y;	
	}
	public Shape(boolean isFilled, boolean canMove) {
		super();
		this.filled = isFilled;
		this.canMove = canMove;
	}
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean Filled) {
		this.filled = Filled;
	}
	public boolean isCanMove() {
		return canMove;
	}
	public void setCanMove(boolean canMove) {
		this.canMove = canMove;
	}
	
	public String toString() {
		return "Created shape!!!";
	}
	public abstract void move(double x, double y);
}
