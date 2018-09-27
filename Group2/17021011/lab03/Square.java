package lab03;

public class Square {
	private double a;

	public Square(double a) {
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	public double C() {
		return 4*a;
	}
	
	public double S() {
		return a*a;
	}
}
