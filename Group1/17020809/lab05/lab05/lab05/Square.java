<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class Square extends Rectangle {
    protected double side;
    public Square(){
        
    }
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
        this.side = side;
    }

   
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }
    

   
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class Square extends Rectangle {
    protected double side;
    public Square(){
        
    }
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
        this.side = side;
    }

   
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }
    

   
    
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
