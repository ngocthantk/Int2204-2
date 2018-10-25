package phamanh.tu;

public class Circle extends Shape {
	protected toado O;
	public Circle(toado o, double bankinh) {
		
		O = o;
		this.bankinh = bankinh;
	}
	final double PI = 3.14;
	protected double bankinh;
	public double chuvi() {
		
		return  2*PI*bankinh;
	}
	public double dientich() {
		
		return PI*bankinh*bankinh;
	}
}
