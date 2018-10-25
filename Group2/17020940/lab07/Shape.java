package lab06;


public class Shape  {
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
	public boolean sameShap(Shape s) {
		if (s instanceof Circle && this instanceof Circle && !(this instanceof Hexagon) && !(s instanceof Hexagon)) {
			return ((Circle)this).equalCircle(s);
		}
		if (s instanceof Rectangle && this instanceof Rectangle && !(this instanceof Square) && !(s instanceof Square)) {
			return ((Rectangle)this).equalRextangle(s);
		}
		if (s instanceof Square  && this instanceof Square ) {
			return ((Square)this).equalSquare(s);
		}
		if (s instanceof Hexagon && this instanceof Hexagon) {
			return ((Hexagon)this).equalHexagon(s);
		}
		if (s instanceof Triangle && this instanceof Triangle) {
			return ((Triangle)this).equalTriangle(s);
		}
		return false;
		
	}
}
