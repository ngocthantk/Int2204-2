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
//lop square ke thua lop rectangle
public class Square extends Rectangle{
    protected double side;
    //ham khoi tao khong co tham so
    public Square(){}
    //ham khoi tao co 1 tham so la side
    public Square(double side){
        super(side, side);
        this.side = side;
    }
    //ham khoi tao voi 3 tham so, trong do width va length tu dong bang side
    public Square(double tamX, double tamY, String color, double side,
    Point gocTrenTrai, Point gocTrenPhai, Point gocDuoiTrai, Point gocDuoiPhai){
        super(tamX,tamY,color,side, side, gocTrenTrai, gocTrenPhai, gocDuoiTrai,
               gocDuoiPhai);
        this.side = side;
    }
    //3 ham setSide width va length se deu set side, length va width = side khi chi goi 1 ham
    public double getSide(){
        return side;
    }
    
    public void setSide(double side){
        this.side = side;
        this.width = side;
        this.length = side;
    }
    
    @Override
    public void setWidth(double side){
        this.side = side;
        this.length = side;
        this.width = side;
    }
    
    @Override
    public void setLength(double side){
        this.length = side;
        this.side = side;
        this.length = side;
    }
//ham toString in ra thong tin cua lop square

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
}
