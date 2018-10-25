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
public class Hexagon extends Shape{
    protected Point Tam,A;

    public Point getTam() {
        return Tam;
    }

    public void setTam(Point Tam) {
        this.Tam = Tam;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }
    public Hexagon(){}
    public Hexagon(double x1,double y1,double x2,double y2){
        this.Tam=new Point(x1, y1);
        this.A=new Point(x2, y2);
    }
    public Point Quay(Point A1){
        Point diem=new Point();
        diem.x=(1/2)*(A1.x-this.Tam.x)-(Math.sqrt(3)/2)*(A1.y-this.Tam.y);
        diem.y=(1/2)*(A1.y-this.Tam.y)+(Math.sqrt(3)/2)*(A1.x-this.Tam.x);
        diem.x+=this.Tam.x;
        diem.y+=this.Tam.y;
        return diem;
    }
    @Override
    public boolean check() {
        return true;
    }

    @Override
    public void move(double a, double b) {
        A.move1(a, b);
        //B.move1(a, b);
        //C.move1(a, b);
        //D.move1(a, b);
        //E.move1(a, b);
        //F.move1(a, b);
        Tam.move1(a, b);
    }
    
}
