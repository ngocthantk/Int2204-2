/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MyPC
 */
public class Shape {
     String Colour = "red";
     boolean filled = true;
    public Shape(){
        
    }
    public Shape(String mau, boolean fill){
        this.Colour = mau;
        this.filled = fill;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString()
    {
        return this.toString();
    }
}
