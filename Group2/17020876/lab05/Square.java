package Shape;

public class Square extends Rectangle {
	public Square() {}
	public Square(double side) 
        {
		super(side, side);
	}
	public Square(double side, String color, Boolean filled)
        {
		super(side, side, color, filled);
	}
	public double getSide() 
        {
		return this.getWidth();
	}
	public void setSide(double side) 
        {
		this.setWidth(side);
		this.setLength(side);
	}
	@Override
	public String toString() 
        {
		return this.color + ", " + this.filled + ", " + this.getWidth() ;
	}
}
