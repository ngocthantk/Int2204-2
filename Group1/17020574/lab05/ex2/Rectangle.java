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
    // lop chữ nhật là con lớp hình
public class Rectangle extends Shape{
    private double width =1.0;
    private double  length =1.0;
    //contructor
    public Rectangle()
    {
        
    }
    public  Rectangle (double width, double length)
    {
        this.length =length;
        this.width = width;


    }
    //khoi tao hinh chu nhat
    public  Rectangle (double width,double length,String mau,boolean filled)
    {
        super(mau,filled);
        this.length = length;
        this.width = width;
    }
    //get     
    public double getWidth()
    {
        return width;
    }
    //set
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    //get
    public double getLength()
    {
        return length;
    }
    //set
    public void setLength(double length)
    {
        this.length = length;
    }
    // diện tích
    public double getArea()
    {
        return(this.getLength()*this.getWidth());
    }
    //chu vi
    public double getPerimeter()
    {
        return (2*(this.getWidth()+this.getLength()));
    }
    //in    
    @Override
    public String toString()
    {
        return super.toString()+" "+this.getArea()+" "+this.getPerimeter();
    }
    
}
