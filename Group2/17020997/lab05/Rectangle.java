/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MyPC
 */
public class Rectangle extends Shape{
     double width = 1.0;
     double length = 1.0;

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

    public Rectangle() {
        
    }

    public Rectangle(double width, double length, String mau, boolean fill) {
        this.Colour = mau;
        this.filled = fill;
        this.length = length;
        this.width = width;
    }
   public double getArea(){
       return this.length*this.width;
   }

  public double getChuVi(){
      return 2*(this.length+this.width);
  }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
}
