/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Liscli
 */
public class Rectangle extends Shape{
    private double width;
    private double length;
    private int[] coordinates = new int[2];
    //init
    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
        this.coordinates[0] = 0;
        this.coordinates[1] = 0;
    }
    public Rectangle(double width,double length,int x,int y){
        this.length = length;
        this.width = width;
        this.coordinates[0] = x;
        this.coordinates[1] = y;
    }
    public Rectangle(double width,double length,String color, boolean filled,int x,int y){
        this.length = length;
        this.width = width;
        this.coordinates[0] = x;
        this.coordinates[1] = y;
    }

    public int[] getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(int x, int y){
        this.coordinates[0] = x;
        this.coordinates[1] = y;
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
    
    @Override
    public String getColor(){
        return this.color;
    }
    //cài màu của hình
    @Override
    public void setColor(String color){
        this.color = color;
    }
    //trả về có đầy hay không 
    @Override
    public boolean isFilled(){
        return this.filled;
    }
    //cài trạng thái đày hay không đầy
    @Override
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    private String color;
    private boolean filled;
}