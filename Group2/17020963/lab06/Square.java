package Diagram;

public class Square extends Rectangle {
	public Square () {}
	
	public Square (double side){
		super(side,side);
	}
	
	public Square (double side, String color, ToaDo A) {
		super(side, side, color, A);
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
