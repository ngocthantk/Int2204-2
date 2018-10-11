/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author nguyen
 */
class Rectangle extends Shape{
    public double width = 1.0;
    public double length = 1.0;
	//Ham khoi tao
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled ){
        super(color,filled);
        this.width = width;
        this.length=length;
   
    }
	//Cac ham setter, getter
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
	//Ham tinh dien tich hinh chu nhat
    public double getArea(){
        return width*length;
    }
	//Ham tinh chu vi hinh chu nhat
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle:" + "width=" + width + ",length=" + length +",color=" + color + ", filled=" + filled +",Area="+this.getArea()+",perimeter="+this.getPerimeter()+"";
    }
    
}
