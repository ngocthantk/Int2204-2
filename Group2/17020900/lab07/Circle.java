package minh.dim;

public class Circle extends Shape{
	public int Rad;
	public final double PI = Math.PI;
	
	public Circle(int a, int x, int y) {
		super(1);
		this.x[0]=x;
		this.y[0]=y;
		this.Rad= a;
	}
	public boolean sameCircle(Circle circle) {
		if(this.x[0]==circle.x[0] && this.Rad == circle.Rad) {
			return true;
		}else {
			return false;
		}
	}
	public void add(int x, int y) {
		this.x[0]=x;
		this.y[0]=y;
	}
}
