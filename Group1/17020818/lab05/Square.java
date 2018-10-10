package lab05;

    public class Square extends Retangle{
	protected double side;
	
    public Square(double side){
        super(side,side);
    }
	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	public void setLength(double length){
		super.setLength(length);
		this.side = length;
	}
	public void setWidth(double width){
		super.setWidth(width);
		this.side = width;
	}
	public double getArea() {
		return side*side;
	}
	public double getPerimeter() {
		return side*4;
	}
	public String toString() {
		return ("Area: "+getArea()+"\nPerimeter: "+getPerimeter());
	}
	public static void main(String[] args) {
    	Square square = new Square("black",true, 15);
    	System.out.print(square.toString());
	}
}
