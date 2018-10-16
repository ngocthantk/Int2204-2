/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Admin
 */
//Lớp rectangle kế thừa từ lớp shape
public class Rectangle extends Shape {
    protected double width; // các thuộc tính mới của lớp rectangle
    protected double length;

    // Các constuctor
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length,String color,boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    
    //Hàm get set
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
    
    public double getArea()
    {
        return(this.getLength()*this.getWidth());
    }
    public double getPerimeter()
    {
        return (2*(this.getWidth()+this.getLength()));
    }
    @Override
    public String toString()
    {
        return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
    }
    
}
