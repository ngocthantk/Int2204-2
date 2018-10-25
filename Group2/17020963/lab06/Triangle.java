package Diagram;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{
	private ToaDo A;
	private ToaDo B;
	private ToaDo C;
	

    public Triangle() {}

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.A = new ToaDo(xA, yA);
        this.B = new ToaDo(xB, yB);
        this.C = new ToaDo(xC, yC);
    }
//get thuoc tinh 
    public ToaDo getA() {
        return A;
    }
    public ToaDo getB() {
        return B;
    }
    public ToaDo getC() {
        return C;
    }
//set thuoc tinh
    public void setA(double a, double b) {
        this.A = new ToaDo(a, b);
    }
    public void setB(double a, double b) {
        this.B = new ToaDo(a, b);
    }
    public void setC(double a, double b) {
        this.C = new ToaDo(a, b);
    }
//getSize   
    public double getSize(){
        double AB = A.distance(B);
        double AC = A.distance(C);
        double BC = B.distance(C);
        double p = (AB + AC + BC) / 2;
        return sqrt(p*(p - AB)*(p - AC)*(p - BC));
    }
//
    public void toSing() {
        System.out.println("Triangle");
    }
}
