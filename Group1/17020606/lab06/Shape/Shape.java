/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.awt.Color;

/**
 *
 * @author Win10
 */
public abstract class Shape {
    protected String color;//mau hinh
    protected boolean filled;//co to mau hay k
    protected boolean isMoved;//co chuyen dong hay k
    protected Color col;
    public Shape(){
        //ham khoi tao mac dinh
        color = "yellow";
        filled = true;
        convertColor();//chuyen tu String thanh Color tuong ung
    }
    public Shape(String color, boolean filled, boolean isMoved){
        //khoi tao co tham so
        this.color = color; this.filled = filled;
        this.isMoved = isMoved;
        convertColor();
    }
    //cac ham set get
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public boolean isMoved(){
        return isMoved;
    }
    public Color getCol(){
        return col;
    }
    public void convertColor(){
        if(color.equals("red")) col = Color.red;
        else if(color.equals("yellow")) col = Color.yellow;
        else if(color.equals("black")) col = Color.black;
        else if(color.equals("green")) col = Color.green;
        else if(color.equals("orange")) col = Color.orange;
        else if(color.equals("blue")) col = Color.blue;
        else if(color.equals("pink")) col = Color.pink;
    }
   
}
