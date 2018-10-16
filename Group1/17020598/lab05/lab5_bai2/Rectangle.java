/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class Rectangle extends Shape{
    
    private double width =1.0;
    private double  length =1.0;
//contractor 
    public  Rectangle ()
    {

    }
    public  Rectangle (double width, double length)
    {
        this.length =length;
        this.width = width;


    }
    public  Rectangle (double width,double length,String color,boolean filled)
    {   
        super(color,filled);
        this.length = length;
        this.width = width;
    }    
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
// chu vi va dien tich   
    public double getArea()
    {
        return(this.getLength()*this.getWidth());//dien tich
    }
    public double getPerimeter()
    {
        return (2*(this.getWidth()+this.getLength()));//chu vi
    }
@Override   
    public String toString()//ham in
    {
        return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
    }
    
}
