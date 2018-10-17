package lab06;

public class Shape {
	protected String shapName ;
	protected String color;
	protected double xMove ;
	protected double yMove ;
	public String getShapName() {
		return shapName;
	}
	public void setShapName(String shapName) {
		this.shapName = shapName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	public Shape() {
		
	}
	public Shape(String s, double x,double y) {
		this.color = s ;
		this.xMove = x ;
		this.yMove = y ;
	}
	public Shape(String color) {
		this.color = color;
	}
	public Shape (double x , double y ) {
		this.xMove = x ;
		this.yMove = y ;
	}
	public boolean check() {
		return true ;
	}
}
