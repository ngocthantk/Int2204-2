package lab6;

public class Shape {
	protected boolean filled;
	protected boolean canMove;
        protected int x,y;
	public Shape() {}
	public Shape(boolean isFilled, boolean canMove) {
		this.filled = isFilled;
		this.canMove = canMove;
	}
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
        public void move(int x, int y){
            
        }

            
	
}
