package lab06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nhozx
 */
public class Triangle extends Shape{
    protected Point dinhA;
    protected Point dinhB;
    protected Point dinhC;

    public Triangle (){}
    public Triangle (double tamX, double tamY, String color, Point dinhA, 
            Point dinhB, Point dinhC){
        super(tamX, tamY, color);
        this.dinhA = dinhA;
        this.dinhB = dinhB;
        this.dinhC = dinhC;
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

    
}
