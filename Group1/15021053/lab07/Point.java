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
public class Point extends Shape {
    public Point(double tamX, double tamY){
        this.tamX = tamX;
        this.tamY = tamY;
    }

    public double getArea(){
        return 0;
    }


    double getPerimeter() {
        return 0;
    }
    public boolean soSanh(Point b){
        return this.tamX == b.getTamX() && this.tamY == b.getTamY();
    }
}
