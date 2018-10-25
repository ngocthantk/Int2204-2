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
//lop Rectangle ke thua lop Shape va la lop cha cua lop Square
public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
    protected Point dinhA;
    protected Point dinhB;
    protected Point dinhC;
    protected Point dinhD;
    public Rectangle(){}
    //ham khoi tao voi 2 tham so
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    //ham khoi tao voi 4 tham so
    public Rectangle(double tamX, double tamY, String color, double width, double length){
        super(tamX, tamY, color);
        this.width = width;
        this.length = length;
    }
    public Rectangle(double tamX, double tamY, String color, double width, double length,
    Point dinhA, Point dinhB, Point dinhC, Point dinhD){
        //super(tamX, tamY, color);
        super(tamX, tamY, color);
        this.width = width;
        this.length = length;
        this.dinhA = dinhA;
        this.dinhB = dinhB;
        this.dinhC = dinhC;
        this.dinhD = dinhD;
    }
    //ham setter getter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getDinhA() {
        return dinhA;
    }

    public void setDinhA(Point dinhA) {
        this.dinhA = dinhA;
    }

    public Point getDinhB() {
        return dinhB;
    }

    public void setDinhB(Point dinhB) {
        this.dinhB = dinhB;
    }

    public Point getDinhC() {
        return dinhC;
    }

    public void setDinhC(Point dinhC) {
        this.dinhC = dinhC;
    }

    public Point getDinhD() {
        return dinhD;
    }

    public void setDinhD(Point dinhD) {
        this.dinhD = dinhD;
    }
    
    //phuong thuc tinh dien tich

    public double getArea(){
        return width * length;
    }
    //phuong thuc tinh chu vi

    public double getPerimeter(){
        return (width + length) * 2;
    }
    //phuong thuc toString su dung ca lop cha

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + 
                ", dinhA=" + dinhA + ", dinhB=" + dinhB 
                + ", dinhC=" + dinhC + ", dinhD=" + dinhD 
                + '}';
    }
    
    
}
