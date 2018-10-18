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
    protected Point gocTrenTrai;
    protected Point gocTrenPhai;
    protected Point gocDuoiTrai;
    protected Point gocDuoiPhai;
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
    Point gocTrenTrai, Point gocTrenPhai, Point gocDuoiTrai, Point gocDuoiPhai){
        //super(tamX, tamY, color);
        super(tamX, tamY, color);
        this.width = width;
        this.length = length;
        this.gocTrenTrai = gocTrenTrai;
        this.gocTrenPhai = gocTrenPhai;
        this.gocDuoiTrai = gocDuoiTrai;
        this.gocDuoiPhai = gocDuoiPhai;
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

    public Point getGocTrenTrai() {
        return gocTrenTrai;
    }

    public void setGocTrenTrai(Point gocTrenTrai) {
        this.gocTrenTrai = gocTrenTrai;
    }

    public Point getGocTrenPhai() {
        return gocTrenPhai;
    }

    public void setGocTrenPhai(Point gocTrenPhai) {
        this.gocTrenPhai = gocTrenPhai;
    }

    public Point getGocDuoiTrai() {
        return gocDuoiTrai;
    }

    public void setGocDuoiTrai(Point gocDuoiTrai) {
        this.gocDuoiTrai = gocDuoiTrai;
    }

    public Point getGocDuoiPhai() {
        return gocDuoiPhai;
    }

    public void setGocDuoiPhai(Point gocDuoiPhai) {
        this.gocDuoiPhai = gocDuoiPhai;
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
                ", gocTrenTrai=" + gocTrenTrai + ", gocTrenPhai=" + gocTrenPhai 
                + ", gocDuoiTrai=" + gocDuoiTrai + ", gocDuoiPhai=" + gocDuoiPhai 
                + '}';
    }
    
    
}
