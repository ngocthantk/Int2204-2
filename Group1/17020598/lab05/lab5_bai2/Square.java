/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class Square extends Rectangle {
   //contractor	
    public Square ()
    {

    }
    public Square (double side)
    {
        super(side,side);

    }
    public Square(double side,String color, boolean filled)
    {
        super(side,side,color,filled);
    }
//get va set    
    public double getSide()
    {
        return this.getLength();
    }
    public void setSide(double side )
    {
        this.setLength(side);
        this.setLength(side);
    }
    @Override
    public void setLength(double side)
    {
        this.setLength(side);
    }
    @Override
    public void setWidth(double side)
    {
        this.setWidth(side);
    }
    @Override
    public String toString()//ham in
    {
        return super.toString();
    }
}
