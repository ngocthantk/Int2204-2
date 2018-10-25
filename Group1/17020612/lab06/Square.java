/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author Admin
 */
public class Square extends Rectangle {

    //Các constructor
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    //hàm get set
    public double getSide()
    {
        return this.getLength();
    }
    public void setSide(double side )
    {
        this.setLength(side);
    }
    @Override
    public void setLength(double side)
    {
        this.length=side;
        this.width=side;
    }
    @Override
    public void setWidth(double side)
    {
        this.setLength(side);
    }
    @Override
    public String toString()
    {
        return super.toString();
    }
}

