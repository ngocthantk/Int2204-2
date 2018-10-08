package tuan5.shape;

public class Square extends Retangle {
	public Square() {
		
	}
	public Square(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	public Square(double side, String color, Boolean filled) {
		this.setWidth(side);
		this.setLength(side);
		this.setColor(color);
		this.setFilled(filled); 
	}
	public double getSide() {
		return this.getWidth();
	}
	public void setSide(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	@Override
	public String toString() {
		return this.getColor() + ", " + this.getFilled() + ", " + this.getWidth();
	}
}
