package tuan6;

public class Square extends Retangle {
	public Square() {
		super();
	}
	public Square(double side, double x, double y) {
		super(side, side, x, y);
	}
	
	public void setSide(double side) {
		super.width=side;
		super.length=side;
	}
	
	@Override
	public void setWidth(double side) {
		setSide(side);
	}
	@Override
	public void setLength(double side) {
		setSide(side);
	}
	@Override
	public String toString() {
		return "Square";
	}
}
