/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

//Lop Shape
public class Shape {
    protected String color = "red";
    protected boolean filled = true;
    //Cac ham setter, getter
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    //Ham khoi tao
    public Shape(){
        
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" + "color: " + color + ", filled =" + filled + '}';
    }

}
