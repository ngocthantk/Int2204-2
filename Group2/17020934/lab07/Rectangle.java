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
public class Rectangle extends Shape {
    private toaDo a;
    private int  cDai;
    private int  cRong;

    public toaDo getA() {
        return a;
    }

    public void setA(toaDo a) {
        this.a = a;
    }

    public double getcDai() {
        return cDai;
    }

    public void setcDai(int cDai) {
        this.cDai = cDai;
    }

    public int getcRong() {
        return cRong;
    }

    public void setcRong(int cRong) {
        this.cRong = cRong;
    }

    public Rectangle(toaDo a, int cDai, int cRong, String color) {
        super(color);
        this.a = a;
        this.cDai = cDai;
        this.cRong = cRong;
    }

    double getArea(){
        return (getcDai()+getcRong())*2;
    }
    //
    double getPerimeter(){
        return getcDai()*getcRong();
    }
    @Override
    public void move(int x, int y) {
         this.a.setX(this.a.getX()+x);
         this.a.setY(this.a.getY()+y);
    }
          
    @Override
    public void draw(Graphics g) {     
        g.drawRect(a.getX(), a.getY(), cDai, cRong);
    }
 
    
}
