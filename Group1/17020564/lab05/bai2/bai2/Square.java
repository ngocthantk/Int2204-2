/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author FEELSBADMAN
 */
public class Square extends Rectangle {	
    public Square() {

    }

    public Square(double side) {

        super(side, side);

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        this.length=side;
        this.width=side;
    }

    public void setLength(double side) {
        this.length=side;
        this.width=side;
    }

    public void setWidth(double side) {
        this.length=side;
        this.width=side;
    }
    

    public String toString() {
        return super.toString();
    }
}
