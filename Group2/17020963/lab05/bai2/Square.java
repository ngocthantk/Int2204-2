package bai2;

public class Square extends Rectangle {
	public Square () {}
	
	public Square (double side){
		super(side,side);
	}
	
	public Square (double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
//get va set side
	public double getSide() {
        return this.getLength();
    }
    public void setSide(double side ) {
        this.setLength(side);
    }
//set length va width
    public void setLength(double side) {
    	super.setLength(side);
    	super.setWidth(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
//
    public String toString() {
        return "Square ";
    }
}
