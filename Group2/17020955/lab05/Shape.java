/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap5_1;

/**
 *
 * @author TranTienPhong
 */
public class Shape {
    protected String color = "red";
    protected Boolean filled = true;
    public  Shape(){}
public  Shape(String color, Boolean filled ) {
    this.color = color;
    this.filled = filled;
}

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
@Override
public String toString(){
    return this.color +"," +this.filled;
    
    
}
    
    
    
    
    

    
    
    
}
