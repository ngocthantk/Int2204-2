/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admin
 */
public class square extends shape{
    public double side;
    public int x;
    public int y;
    square(){
        super();
        this.side= 1.0;
     
    }
    square(int x,int y,double side,String color){
        super(x,y,color);
        this.side= side;
     
    }
      public double getArea(){
        return (this.side*this.side);
    }

}
