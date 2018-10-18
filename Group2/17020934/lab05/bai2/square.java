/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ba2;

/**
 *
 * @author tuann_000
 */
public class square extends rectangle{
    
    private double side;
    public square() {
    }
    public square(double side) {
        
    }

    public square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setWidth(double side) {
        this.width=side;
        this.length=side;
    }
    @Override
    public void setLength(double side) {
        this.width=side;
        this.length=side;
        
    }
    @Override
    public String toString(){
        return this.getColor()+this.isFilled()+this.side;
    }
}
