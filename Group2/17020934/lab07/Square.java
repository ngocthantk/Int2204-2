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

public class Square extends Shape{
    private toaDo a;
    private int canh;

    public Square(String color) {
        super(color);
    }

    public toaDo getA() {
        return a;
    }

    public void setA(toaDo a) {
        this.a = a;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public Square(toaDo a, int canh, String color) {
        super(color);
        this.a = a;
        this.canh = canh;
    }

    @Override
    public void move(int x, int y) {
        a.setX(x+a.getX());
        a.setY(y+a.getY());
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(a.getX(), a.getY(), canh, canh);
    }
     
   
}
        
