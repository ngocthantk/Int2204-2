/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc2;

import static hinhhoc2.Point.lenght;

public class Rectangle extends Shape
{
    Point a;
    Point b;
    Point c;
    Point d;
    public void setA(double a, double b){
        this.a.setX(a);
        this.b.setX(b);
    }
    public void setB(double a, double b){
        this.a.setX(a);
        this.b.setX(b);
    }
    public void setC(double a, double b){
        this.a.setX(a);
        this.b.setX(b);
    }
    public void setD(double a, double b){
        this.a.setX(a);
        this.b.setX(b);
    }
    public Rectangle(){
        this.a.setX(0);
        this.a.setY(0);
        this.b.setX(1);
        this.b.setY(0);
        this.c.setX(0);
        this.c.setY(2);
        this.d.setX(1);
        this.d.setY(2);
    }
    public  Rectangle (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, String color, boolean filled)    //tham số chiều dài rộng, màu filled mặc định
    {
        super(color, filled);
        this.setA(x1, y1);
        this.setB(x2, y2);
        this.setC(x3, y3);
        this.setD(x4, y4);
    }
    public boolean checkIsRec(){
        boolean check=false;
        double ab=lenght(this.a, this.b);
        double cd=lenght(this.b, this.c);
        double ac=lenght(this.a, this.c);
        double bd=lenght(this.b, this.d);
        if(ab==cd&&ac==bd){
            check=true;
        }
        return check;
    }
}