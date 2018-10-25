package dỉagram;

import static java.lang.Math.sqrt;

public class ToaDo {
	private double x = 0;
	private double y = 0;
	
	public ToaDo(double x0, double y0) {
    	this.x = x0;
    	this.y = y0;
    }  
    public double getX() {
    	return x;
    }
    public double getY() {
    	return y;
    }  
    public double setX(double x0) {
        return this.x = x0;
    }
    public double setY(double y0) {
        return this.y = y0;
    }
    public double distance(ToaDo A) {
    	double dis = sqrt((A.getX() - this.x)*(A.getX() - this.x) + (A.getY() - this.y)*(A.getY() - this.y));
    	return dis;
    }
    public void move(double x0, double y0) {
    	this.x = x0;
    	this.y = y0;
    }
    
}
