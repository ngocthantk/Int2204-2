/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Nhozx
 */
//lop Rectangle ke thua lop Shape va la lop cha cua lop Square
public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    
    public Rectangle(){}
    //ham khoi tao voi 2 tham so
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    //ham khoi tao voi 4 tham so
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    //ham setter getter
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
    //phuong thuc tinh dien tich
    public double getArea(){
        return width * length;
    }
    //phuong thuc tinh chu vi
    public double getPerimeter(){
        return (width + length) * 2;
    }
    //phuong thuc toString su dung ca lop cha
    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + 
                "color=" + color + ", filled=" + filled+'}';
    }
    
}
