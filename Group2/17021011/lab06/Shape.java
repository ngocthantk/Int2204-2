package lab06;

public abstract class Shape {
	protected boolean filled;
	protected boolean canMove;
	
	// Constructor
	public Shape() {}
	public Shape(boolean isFilled, boolean canMove) {
		super();
		this.filled = isFilled;
		this.canMove = canMove;
	}
	
	// getter, setter
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean isFilled) {
		this.filled = isFilled;
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
	
	// Calculate
	public abstract boolean check();
	public abstract void move(double x, double y);
}
