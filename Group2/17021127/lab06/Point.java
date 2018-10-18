/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import static java.lang.Math.sqrt;

/**
 *
 * @author CCNE
 */
public class Point {
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double length(Point X){
        return sqrt((x - X.getX()) * (x - X.getX()) + (y - X.getY()) * (y - X.getY()));
    }
    public boolean vuongGoc(Point C, Point D){
        double a = (x-C.x) * (x-D.x);
		double b = (y-C.y) * (y-D.y);
		if(a + b == 0) return true;
		return false;
    }
    public void movePoint(double x,double y) {
		this.x += x;
		this.y += y;
	}
}
