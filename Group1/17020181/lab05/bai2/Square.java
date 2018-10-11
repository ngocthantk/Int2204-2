/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;


/**
 *
 * @author Ha
 */
public class Square extends Rectangle{
    
    
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }
    
    public Square(double side,String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    
    
}
