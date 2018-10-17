/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

public class Circle extends Shape{
    final double PI= 3.14;  //số pi
    private double radius; //bán kính
    public Circle()       // khởi tạo
    {
        super();
        this.radius=1.00;
    };
    public Circle(double radius)  //khởi tạo có tham số bán kính, màu và filled mặc định
    {
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled) // khởi tạo có tham số là bán kính ,màu ,filled
    {   
        super(color, filled);
    	this.radius=radius;
        
    }
    public double getRadius()      // lấy bán kính
    {
        return radius;
    }
    public void setRadius(double radius)  //cài bán kính
    {
        this.radius = radius;
    }
    public double getArea()  //trả diện tích
    {
        return(PI*this.radius*this.radius);
    }
    public double getPerimeter()   // chu vi
    {
        return (2*PI*this.radius);
    }
    @Override
    public String toString() {
    	return super.toString()+" "+this.getArea()+" "+this.getPerimeter();   //in ra màu, filled, diện tích, chu vi
    }
}
