/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author tuann_000
 */
public class Rectangle extends Shape {
    private toaDo a;
    private double cDai;
    private double cRong;

    public toaDo getA() {
        return a;
    }

    public void setA(toaDo a) {
        this.a = a;
    }

    public double getcDai() {
        return cDai;
    }

    public void setcDai(double cDai) {
        this.cDai = cDai;
    }

    public double getcRong() {
        return cRong;
    }

    public void setcRong(double cRong) {
        this.cRong = cRong;
    }

    public Rectangle(toaDo a, double cDai, double cRong, String color) {
        super(color);
        this.a = a;
        this.cDai = cDai;
        this.cRong = cRong;
    }

    double getArea(){
        return (getcDai()+getcRong())*2;
    }
    //
    double getPerimeter(){
        return getcDai()*getcRong();
    }
    @Override
    public void move(double x, double y) {
         this.a.setX(this.a.getX()+x);
         this.a.setY(this.a.getY()+y);
    }
    
}
