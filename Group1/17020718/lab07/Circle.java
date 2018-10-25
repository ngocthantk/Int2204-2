package lap07;



public class Circle extends Shape{
	private double r;
	private Point tam;
	public Point getTam() {
		return tam;
	}
	public void setTam(double m,double n) {
		this.tam = new Point(m,n);
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public Circle(double r,double m,double n) {
		this.r = r;
		this.tam = new Point(m,n);
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
		tam.moveP(a,b);
	}
	
}