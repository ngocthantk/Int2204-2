package lab03;

public class Circle {
	private double R;

	public Circle(double r) {
		super();
		R = r;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}
	
	public double C() {
		return 2*Math.PI*R;
	}

	public double S() {
		return Math.PI*R*R;
	}
}
