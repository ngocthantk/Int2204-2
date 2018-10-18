package lab06;

public class Circle extends Shape{
	private double r;
	private point heart;
	public point getHeart() {
		return heart;
	}
	public void setHeart(double x,double y) {
		this.heart = new point(x,y);
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle(double r,double x,double y) {
		this.r = r;
		this.heart = new point(x,y);
	}
	public Circle(String color) {
		this.color = color;
	}
	@Override
	public boolean check() {
		if(r!=0) {
			return true;
		}
		return false;
	}
	@Override
	public void move(double a, double b) {
		// TODO Auto-generated method stub
		heart.moveP(a,b);
	}
	
}
