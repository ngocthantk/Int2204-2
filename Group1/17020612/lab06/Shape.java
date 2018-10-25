/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Admin
 */
public class Shape {
    protected String color="red"; // khời tạo các thuộc tính của lớp Shape
    protected boolean filled=true;
   
    //Các constructor
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    

    public String getColor() {
        return color;
    }

    //Hàm get set
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString()
    {
        return  this.color + " " + this.filled;

    }
    
}

