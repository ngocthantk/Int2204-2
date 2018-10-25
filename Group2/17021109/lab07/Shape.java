package Tuan06;

public abstract class Shape {
	protected int x=50,y=50;
	protected boolean filled;
	protected boolean canMove;
	
	// Constructor
	public Shape() {}
	public Shape(int x, int y) 
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
	public abstract void move(int x, int y);

}
