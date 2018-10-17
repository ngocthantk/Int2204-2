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
public class Circle extends Shape{
    private double R;
    protected Point Tam;

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public Point getTam() {
        return Tam;
    }

    public void setTam(double a,double b) {
        this.Tam = new Point(a, b);
    }
    public Circle(double a,double b){
        this.Tam=new Point(a, b);
    }
    @Override
    public boolean check(){
        if(getR()>0)
            return true;
        return false;
    }
    @Override
    public void move(double a,double b){
        Tam.move1(a, b);
    }
}
