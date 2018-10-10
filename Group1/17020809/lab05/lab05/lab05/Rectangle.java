/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class Rectangle extends Shape {
    protected double width = 1.0;//chiều rộng
    protected double length = 1.0;//chiều dài
   
   
    public Rectangle(){
        
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = this.length*this.width;//diện tích
        return area;
    }

    public double getPerimeter() {
         
        double perimeter = 2*(this.length+this.width);//chu vi
        return perimeter;
    }
    
    
}
