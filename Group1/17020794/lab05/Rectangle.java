/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;
public class Rectangle extends Shape
{
    private double width;   //chiều rộng
    private double  length ;   //dài
    public Rectangle()      //khởi tạo mặc định
    {
        super();
        this.length=1.0;
        this.width=1.0;
    }
    public  Rectangle (double width, double length)    //tham số chiều dài rộng, màu filled mặc định
    {
        super();
        this.length =length;
        this.width = width;
    }
    public  Rectangle (double width,double length,String color,boolean filled) //tham số dài rộng, màu , filled
    {
        super(color, filled);
        this.length = length;
        this.width = width;
       
    }  
    public double getWidth()   //lấy rộng
    {
        return width;
    }
    public void setWidth(double width) //cài rộng
    {
        this.width = width;
    }
    public double getLength()    //lấy dài
    {
        return length;
    }
    public void setLength(double length) //cài dài
    {
        this.length = length;
    } 
    public double getArea()   //diện tích
    {
        return(this.getLength()*this.getWidth());
    }
    public double getPerimeter()   ///chu vi
    {
        return (2*(this.getWidth()+this.getLength()));
    }
    @Override
    public String toString()  //in ra màu, filled, diện tích, chu vi
    {
        return " "+this.getArea()+" "+this.getPerimeter();
    }
}

