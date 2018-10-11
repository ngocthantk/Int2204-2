/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Liscli
 */
public class Rectangle extends Shape{
    private double width;
    private double length;
    //init
    public Rectangle(){
        super();
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double width,double length){
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width,double length,String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    // trả về chiều rộng của hình chữ nhật
    public double getWidth(){
        return this.width;
    }
    //cài chiều rộng của hình chữ nhật
    public void setWidth(double width){
        this.width = width;
    }
    //trả về chiều dài của hình chữ nhật
    public double getLength(){
        return this.length;
    }
    // cài chiều dài của hình chữ nhật
    public void setLength(double length){
        this.length = length;
    }
    // trả về diện tích của hình chữ nhật
    public double getArea(){
        return this.width*this.length;
    }
    // trả về chu vi của hình chữ nhật
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
}
