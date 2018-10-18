/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap6;

/**
 *
 * @author TranTienPhong
 */
public class Square extends Rectangle{
    protected double side;
    public Square(){
        
    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }    

    public Square(double side, String color, boolean filled, Toado tam) {
        super(side, side, color, filled, tam);
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    @Override
    public void info() {
        System.out.println("hinh vuong co canh la: " + side);
    }
    
}
