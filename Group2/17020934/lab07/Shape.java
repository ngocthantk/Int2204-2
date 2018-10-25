/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Graphics;

/**
 *
 * @author tuann_000
 */
public abstract class Shape{
    protected String color;
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public abstract void move(int x, int y);
    //

    public Shape(String color) {
        this.color = color;
    }
    public abstract void draw(Graphics g);
//    public abstract boolean checkDraw();
    

}