package minh.dim;

public class Square extends Rectangle {
	

	public void setSide(double side) {
		
		width=side;
		length=side;
	}
	public Square() {
		super();
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled);
		
	}
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	public static void main(String[] args) {
		Square square = new Square(6.0, "red", true);
		square.setSide(6.0);
		square.setWidth(7);
		System.out.println("diện tích hình vuông " + square.getArea() + "\nchu vi hình vuông " + square.getPerimeter());
	}
}
