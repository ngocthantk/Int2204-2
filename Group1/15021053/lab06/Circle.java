/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Nhozx
 */
//lop circle  ke thua lop shape
public class Circle extends Shape{
    final double PI = 3.14;//de PI la hang vi day la so khong thay doi gia tri
    //ham khoi tao khong tham so
    public Circle(){}
    
    //ham khoi tao
    public Circle(double tamX, double tamY, String color, double size){
        super(tamX, tamY, color, size);
    }
    //ham getter, setter

    //tinh dien tich

    public double getArea(){
        return PI * size * size;
    }
    //tinh chu vi

    public double getPerimeter(){
        return PI * 2 * size;
    }

    @Override
    public String toString() {
        return "Circle{" + "PI=" + PI + '}';
    }
    
}
