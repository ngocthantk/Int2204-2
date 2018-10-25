/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Nhozx
 */
//lop Shape la lop cha
public abstract class Shape {
    protected double tamX;
    protected double tamY;
    protected String color;
    protected double size;
    // ham khoi tao khong co tham so
    public Shape(){}
    //ham khoi tao co tham so
    public Shape(double tamX, double tamY, String color){
        this.tamX = tamX;
        this.tamY = tamY;
        this.color = color;
    }
    public Shape(double tamX, double tamY, String color, double size){
        this.tamX = tamX;
        this.tamY = tamY;
        this.color = color;
        this.size = size;   
    }
    //cac ham setter getter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTamX() {
        return tamX;
    }

    public void setTamX(double tamX) {
        this.tamX = tamX;
    }

    public double getTamY() {
        return tamY;
    }

    public void setTamY(double tamY) {
        this.tamY = tamY;
    }
    
    // lop abstract giup di chuyen hinh 
    public void move(double x, double y){
        this.tamX = x;
        this.tamY = y;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", tamX=" + tamX + ", tamY=" 
                + tamY + ", size=" + size + '}';
    }
    
}
