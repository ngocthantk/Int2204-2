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
public class Shape {
    private String color; //màu của hình
    private boolean filled; // đầy hay không
    //init 
    public Shape(){
        color = "red";
        filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    // trả về màu của hình
    public String getColor(){
        return this.color;
    }
    //cài màu của hình
    public void setColor(String color){
        this.color = color;
    }
    //trả về có đầy hay không 
    public boolean isFilled(){
        return this.filled;
    }
    //cài trạng thái đày hay không đầy
    public void setFilled(boolean filled){
        this.filled = filled;
    }
}
