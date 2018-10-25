/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author AnhTam
 */
public class Rectangle extends Shape{
    protected int chieudai,chieurong;
    protected String color;

    Rectangle(int dai, int rong, String color, int x, int y){
        chieudai=dai;
        chieurong= rong;
        this.color = color;
        this.x=x;
        this.y=y;
    }

    Rectangle() {
        
    }
    
    public int getChieudai() {
        return chieudai;
    }


    public int getChieurong() {
        return chieurong;
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

}