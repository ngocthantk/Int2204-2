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
public class Shape {
    protected String color;
    protected boolean filled;
    Shape(String color, boolean filled){
        this.color = "red";
        this.filled = true;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean getfilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
}
