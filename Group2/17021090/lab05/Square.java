package lab05_01;

public class Square extends Rectangle {

	//constructors
    public Square() {}
    
    public Square(double side) {
    	super(side,side);
    }
    
    public Square(double side, String color, boolean filled) {
    	super(side,side,color,filled);
    }

    //getter and setter
    public double getSide() {
        return this.getWidth();
    }
    
    public void setSide(double side)
    {
    	super.setWidth(side);
    	super.setLength(side);
    }
    
    @Override
	public String toString() {
    	return "Square [Side=" + getLength() + "]";
	}
    
    @Override
    public void setWidth(double side)
    {
    	setSide(side);
    }
    
    @Override
    public void setLength(double side)
    {
    	setSide(side);
    }
}
