package lab06;

public class Square extends Rectangle {

	//constructors
    public Square() {}
    
    public Square(double side,double x1, double y1) {
    	super(side,side,x1,y1);
    }
    

	@Override
	public String toString() {
		return "Square [side=" + width + ", x1=" + x1 + ", y1=" + y1 + ", color=" + color
				+ ", x=" + x + ", y=" + y + ", area=" + area + "]";
	}

	public Square(double side, double x, double y, double x1, double y1) {
    	super(side,side,x,y,x1,y1);
    }
    
}

