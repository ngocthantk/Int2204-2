package Diagram;

import static java.lang.Math.sqrt;

public class ToaDo {
	private int x = 0;
	private int y = 0;
	
	public ToaDo(int x0, int y0) {
    	this.x = x0;
    	this.y = y0;
    }
// get thuoc tinh   
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
// set thuoc tinh  
    public int setX(int x0) {
        return this.x = x0;
    }
    public int setY(int y0) {
        return this.y = y0;
    }
//
    public int distance(ToaDo A) {
    	int dis = (int) sqrt((A.getX() - this.x)*(A.getX() - this.x) + (A.getY() - this.y)*(A.getY() - this.y));
    	return dis;
    }
    public void move(int x0, int y0) {
    	this.x = x0;
    	this.y = y0;
    }
    
}
