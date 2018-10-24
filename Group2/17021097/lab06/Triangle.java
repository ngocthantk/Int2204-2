package phamanh.tu;

public class Triangle extends Shape {
	
	protected toado A;
	protected toado B;
	protected toado C;
	public Triangle(toado a, toado b, toado c) {
		
		A = a;
		B = b;
		C = c;
	}
	public double canh1() {
		double a =  Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
		return a;
	}
	public double canh2() {
		double b =  Math.sqrt(Math.pow(A.getX() - C.getX(), 2) + Math.pow(A.getY() - C.getY(), 2));
		return b;
	}
	public double canh3() {
		double c =  Math.sqrt(Math.pow(B.getX() - C.getX(), 2) + Math.pow(B.getY() - C.getY(), 2));
		return c;
	}
	public double chuvi() {
		return (canh1() + canh2() + canh3());
	}
	public double dientich() {
		double p= (canh1() + canh2() + canh3())/2;
		double S = Math.sqrt(p*(p - canh1())*(p - canh2())*(p - canh3()));
		return S;
	}
}
