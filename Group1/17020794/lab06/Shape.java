/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc2;

import static java.lang.Math.sqrt;

public abstract class Shape {
    double x;
    double y;
    private String color;
    private boolean filled;
    public Shape()
    {
       this.color="red";
       this.filled=true;
    }
    public Shape(String color,boolean filled)//hàm khởi tạo hình có tham số
    {
        this.color=color;
        this.filled=filled;
    }
    public String getColor()//lấy màu
    {
        return color;
    }
    public void setColor(String color) //cài màu
    {
        this.color = color;
    }
    public boolean isFilled() 
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    @Override
    public String toString() //trả về chuỗi chứa tên màu và filled của hình;
    {
        return  this.color + " " + this.filled;
    }
}
