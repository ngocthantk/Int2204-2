/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Liscli
 */
public class Square extends Rectangle{
    //init
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }
    // trả về cạnh của hình vuông
    public double getSide(){
        return super.getWidth();
    }
    // ghi đè phương thức để 2 cạnh luôn bằng nhau khi cài theo 1 chiều
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    //cài cạnh của hình vuông
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
}
