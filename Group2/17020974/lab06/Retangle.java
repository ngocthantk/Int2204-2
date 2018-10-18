/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author admincxq
 */
public class Retangle extends Shape {
    protected Point A,B,C,D;

    public Point getA() {
        return A;
    }

    public void setA(double x,double y) {
        this.A = new Point(x,y);
    }

    public Point getB() {
        return B;
    }

    public void setB(double x,double y) {
        this.B = new Point(x, y);
    }

    public Point getC() {
        return C;
    }

    public void setC(double x,double y) {
        this.C = new Point(x, y);
    }

    public Point getD() {
        return D;
    }

    public void setD(double x,double y) {
        this.D = new Point(x, y);
    }
    public Retangle(double x1,double x2,double x3,double x4,double y1,double y2,double y3,double y4){
        this.A=new Point(x1,y1);
        this.B=new Point(x2,y2);
        this.C=new Point(x3,y3);
        this.D=new Point(x4,y4);
    }
    @Override
    public boolean check(){
        if(A.ktvuong(D, B)&&B.ktvuong(A, C)&&C.ktvuong(D, B)){
            return true;
        }
        return false;
    }
    @Override
    public void move(double a,double b){
        A.move1(a, b);
        B.move1(a, b);
        C.move1(a, b);
        D.move1(a, b);
    }
}
