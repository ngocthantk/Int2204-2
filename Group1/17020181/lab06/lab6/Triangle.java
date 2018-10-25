package lab6;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{
	private Location A;
	private Location B; 
	private Location C; 
	

    public Triangle() {}

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.A = new Location(xA, yA);
        this.B = new Location(xB, yB);
        this.C = new Location(xC, yC);
    }

    public Location getA() {
        return A;
    }
    public Location getB() {
        return B;
    }
    public Location getC() {
        return C;
    }

    public void setA(double a, double b) {
        this.A = new Location(a, b);
    }
    public void setB(double a, double b) {
        this.B = new Location(a, b);
    }
    public void setC(double a, double b) {
        this.C = new Location(a, b);
    }

    public double getSize(){
        double AB = A.distance(B);
        double AC = A.distance(C);
        double BC = B.distance(C);
        double p = (AB + AC + BC) / 2;
        return sqrt(p*(p - AB)*(p - AC)*(p - BC));
    }

    public void toSing() {
        System.out.println("Triangle");
    }
}
