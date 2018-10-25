/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author user56
 */
public class Triangle extends Shape{
    private Point point1;
    private Point point2;
    private Point point3;
    
    public Triangle(){}
    
    public Triangle(double x,double y,double size,String color,String move){
         super(x,y,size,color,move);
    }
    
   

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(int x,int y) {
        this.point1 = new Point(x,y);
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(int x,int y) {
        this.point2 = new Point(x,y);
    }
    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(int x,int y) {
        this.point3 = new Point(x,y);
    }
    
    
}
