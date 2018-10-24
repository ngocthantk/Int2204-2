/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

/**
 *
 * @author Win10
 */
public class Rectangle extends Shape{
    protected int x1,y1;//toa do diem trai tren cung cua Rectangle
    protected int x2,y2;//do rong va do dai cua Rectangle
    
    public Rectangle(int x1, int y1, int x2, int y2){
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
    }
    public Rectangle(int x1, int y1,int x2,int  y2, String color, boolean filled, boolean move){
        super(color,filled, move);
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
    }
    public void setPoint1(int x1, int  y1){
        this.x1 = x1; this.y1 = y1;
    }
    public void setPoint2(int x2, int y2){
        this.x2 = x2; this.y2 = y2;
    }
    public void moved(){
        x1+=5; y1+=5;
       
    }
    public int getX1(){
        return x1;
    }
    public int getX2(){
        return x2;
    }
    public int getY1(){
        return y1;
    }
    public int getY2(){
        return y2;
    }
}
