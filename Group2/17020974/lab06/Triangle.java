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
public class Triangle extends Shape{
    protected Point A,B,C;

    public Point getA() {
        return A;
    }

    public void setA(double a,double b) {
        this.A = new Point(a, b);
    }

    public Point getB() {
        return B;
    }

    public void setB(double a,double b) {
        this.B = new Point(a, b);
    }

    public Point getC() {
        return C;
    }

    public void setC(double a,double b) {
        this.C = new Point(a, b);
    }
    public Triangle(double x1,double x2,double x3,double y1,double y2,double y3){
        this.A=new Point(x1,y1);
        this.B=new Point(x2,y2);
        this.C=new Point(x3,y3);
    }
    @Override
    public boolean check(){
        double a=A.khoangcach(B);
        double b=B.khoangcach(C);
        double c=C.khoangcach(A);
        if(a+b>c&&a+c>b&&b+c>a)
            return true;
        return false;
    }
    @Override
    public void move(double a,double b){
        A.move1(a, b);
        B.move1(a, b);
        C.move1(a, b);
    }
}
