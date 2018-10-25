/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author CCNE
 */
public class Square extends Rectangle {
    
    public Square(){
        
    }

    public Square(double side) {
      super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super.width=width;
        super.setLength(side);
        super.setColor(color);   
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

   @Override
   
    public void setLength(double side) {
        setSide(side);
    }
   
}
