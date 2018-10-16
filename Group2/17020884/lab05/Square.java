package shape;

public class Square extends Rectangle{
	
	public Square() {
		new Rectangle();
	}
	
	public Square(double side) {
		super(side,side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
	}
	
	public double getSide() {
		return this.getLength();
	}
	
	public void setSide(double side) {
		this.setLength(side);
	}
	
	@Override
	public void setWidth(double side) {
		length=side;
		width =side;
	}
	
	public void setLength(double side) {
		length=side;
		width =side;
	}
}
