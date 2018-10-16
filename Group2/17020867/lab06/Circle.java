package lab06;

public class Circle extends Shape {
	private double radian;
	private final double PI = Math.PI;
	
	public Circle() {
		
	}
	public Circle(double radian) {
		super();
		this.radian = radian;
	}
	
	public double getRadian() {
		return radian;
	}

	public void setRadian(double radian) {
		this.radian = radian;
	}
	
	@Override
	public void size() {
		System.out.println(radian*radian*PI);
	}

	@Override
	public void move(double x, double y) {
		super.x=x;
		super.y=y;
	}
	@Override
	public String toString() {
		return "Circle";
	}
}