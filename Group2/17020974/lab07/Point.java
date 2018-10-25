/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admincxq
 */
public class Point {
    protected double x,y;
    Point(){}
    Point(double x, double y) {
        this.x=x;
        this.y=y;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void move1(double a,double b){
        this.x+=a;
        this.y+=b;
    }
    public double khoangcach(Point A){
        return Math.sqrt((this.x-A.x)*(this.x-A.x)+(this.y-A.y)*(this.y-A.y));
    }
    public boolean ktvuong(Point A,Point B){
        double x=(this.x-A.x)*(this.x-B.x);
        double y=(this.y-A.y)*(this.y-B.y);
        if(x+y==0)
            return true;
        return false;
    }
}
