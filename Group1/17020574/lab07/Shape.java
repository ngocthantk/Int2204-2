
package Shape;

import java.awt.Color;

public abstract class Shape {
    //màu h?nh
    protected String color;
    //xác nhan viec to mau
    protected boolean filled;
    //xet su chuyen dong
    protected boolean isMoved;
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
