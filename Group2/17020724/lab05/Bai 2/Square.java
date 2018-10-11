package ex2;

public class Square extends Rectangle {
	private double side = 1.0;
	public Square() {}
	public Square(double side) {
		this.side = side;
		this.width = side;
		this.length = side;
	}
	public Square(double side, String color, boolean filled) {
		this.width = side;
		this.color = color;
		this.filled = filled;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.width = side;
		this.setSide(side);
	}
	public void setWidth(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	public void setLength(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	public String toString() {
		return "Square\nWidth = " + getWidth() + "\nLength = " + getLength() + "\nPerimeter = " + getPerimeter() + "\nArea = " + getArea() + "\n";
	}

}
