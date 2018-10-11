/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Dat Anh
 */
//lop hvuong ke thua hcn
public class Square extends Rectangle{
    //contructor
    public Square(){
        
    }
    
    public Square (double side)
    {

        super(side,side);

    }
    public Square(double side,String mau, boolean filled)
    {
        super(side,side,mau,filled);
    }
    //get
    public double getSide()
    {
        return this.getLength();
    }
    //set
    public void setSide(double side )
    {
        this.setLength(side);
    }
    //set
    @Override
    public void setLength(double side)
    {
        super.setLength(side);
    }
    //set
    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
    }
    //in    
    @Override
    public String toString()
    {
        return super.toString();
    }
    
    
}
