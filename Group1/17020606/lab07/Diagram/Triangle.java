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
public class Triangle extends Shape{
    private int x1,x2,x3;//mang toa do x
    private int y1,y2,y3;//mang toa do y cua tam giac
    public Triangle(int x1, int x2, int x3, int y1, int y2, int y3, String color, boolean filled,boolean move){
        super(color, filled, move);
        this.x1 = x1; this.x2 = x2; this.x3 = x3;
        this.y1 = y1; this.y2 = y2; this.y3 = y3;
    }
    public void moved(){
        //ham dich chuyen hinh
        x1+= 5; y1+=5;
        x2+= 5; y2+=5;
        x3+= 5; y3+=5;
    }
    public int getX1(){
        return x1;
    }
    public int getX2(){
        return x2;
    }
    public int getX3(){
        return x3;
    }
    public int getY1(){
        return y1;
    }
    public int getY2(){
        return y2;
    }
    public int getY3(){
        return y3;
    }
}
