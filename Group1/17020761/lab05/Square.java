package chap05.oop2;

public class Square extends Rectangle{
	public double getSide() {
		return this.getWidth();
	}
	public void setSide(double side) {
		this.setLength(side);
		this.setWidth(side);
	}
	public Square() {
		
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side,String color,boolean filled ) {
		super(side,side,color,filled);
	}
	@Override
	public String toString() {
		return "qkI";
	}
	@Override
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	@Override
	public void setWidth(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
}
