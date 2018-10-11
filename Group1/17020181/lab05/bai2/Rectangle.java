/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Ha
 */
public class Rectangle extends Shape{ // hình chữ nhật
    private double width = 1.0; // chiều rộng
    private double length = 1.0; // chiều dài
    
    public Rectangle() {
    }
    
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length,String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
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
    public double getArea() { // tính diện tích hình chữ nhật
        double area = this.width*this.length;
        return area;
    }
    
    public double getPerimeter(){ // chu vi hình chữ nhật
        double perimeter = (this.width + this.length)*2;
        return perimeter;
    }
    
}
