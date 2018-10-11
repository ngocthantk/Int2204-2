package tuan5.shape;

public class Square extends Retangle {
	public Square() {
		
	}
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, Boolean filled) {
		super(side, side , color, filled);
	}
	public double getSide() {
		return this.width;
	}
	public void setSide(double side) {
		super.width = side;
		super.length = side;
	}
	public void setWidth(double side) {
		this.setSide(side);
	}
	public void setLength(double side) {
		this.getSide();
	}
	@Override
	public String toString() {
		return "Square";
	}
}
