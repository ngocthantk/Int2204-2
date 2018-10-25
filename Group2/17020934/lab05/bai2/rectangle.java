/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba2;


/**
 *
 * @author tuann_000
 */
public class rectangle extends shape{
    protected double width;
    double length;

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
    
    public rectangle(){
        
    }
    public rectangle(double width, double length, String color, boolean filled){
        this.width= width;
        this.length = length;
        super.color= color;
        super.filled= filled;       
    }
    //
    double getArea(){
        return (getWidth()+getLength())*2;
    }
    //
    double getPerimeter(){
        return getLength()*getWidth();
    }
    //
     @Override
    public String toString(){
        return this.getColor()+this.isFilled()+this.getWidth()+this.getLength();
    } 
}
