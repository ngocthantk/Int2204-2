/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author admincxq
 */
public class Rectangle extends Shape{
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){}
    public Rectangle(double w,double l){
        this.width=w;
        this.length=l;
    }    
    public Rectangle(double w,double l,String color,boolean filled){
        super(color,filled);
        this.length=l;
        this.width=w;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return width+" "+length+" "+getArea()+" "+getPerimeter();
    }
}
