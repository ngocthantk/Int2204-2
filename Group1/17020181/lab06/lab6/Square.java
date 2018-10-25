package lab6;

public class Square extends Rectangle {
	public Square () {}
	
	public Square (double side){
		super(side,side);
	}
	
	public Square (double side, String color, Location A) {
		super(side, side, color, A);
	}

	public double getSide() {
        return this.getLength();
    }
    public void setSide(double side ) {
        this.setLength(side);
    }

    public void setLength(double side) {
    	super.setLength(side);
    	super.setWidth(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public String toString() {
        return "Square ";
    }
}
