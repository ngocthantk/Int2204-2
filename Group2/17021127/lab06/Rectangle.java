package lab6;

import static java.lang.Math.sqrt;

public class Rectangle extends Shape {
    protected  Point A,B,C,D;
    protected  double width , length;
    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }

    public Point getD() {
        return D;
    }

    public void setD(Point D) {
        this.D = D;
    }

    @Override
    public boolean check(){
       if(A.vuongGoc(B, C) && B.vuongGoc(C, A) && C.vuongGoc(B, D)) return true;
       return false;
                      
    }
    public double getLength(){
       return A.length(B);
        
    }
    public double getWidth(){
       return A.length(C);
    }
    public double getArea(){
        return this.getWidth()*this.getLength();
    }
    public double getPerimeter(){
       return 2* (this.getWidth() + this.getLength());
    }

    @Override
    public void move(double x, double y) {
                A.movePoint(x, y);
		B.movePoint(x, y);
		C.movePoint(x, y);
		D.movePoint(x, y);
    }
}