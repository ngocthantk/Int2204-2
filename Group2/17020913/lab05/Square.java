package KeThua_2;

public class Square extends Rectangle {
	public Square() {};
	public Square(double side) {
		super(side, side);
	}
	public Square(double side, String color, boolean filled)
	{
		this.width= width;
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
	
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	@Override
	public String toString() {
		return this.getColor()+","+this.isFilled()+","+ this.getWidth();
		
		
	}
}
