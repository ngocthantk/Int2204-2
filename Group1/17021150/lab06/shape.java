/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admin
 */
public abstract class shape {
     public String color;
     public int x;
     public int y;
    shape(){
        this.color = "red";
        this.x=1;
        this.y=1;
        }
    shape(int x,int y,String color){
        this.color = color;
       this.x=x;
       this.y=y;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

   abstract double getArea(); 
    
   
    
}
