package Lab07;

public class Circle extends Shape {
	public int r;
	public final double PI = Math.PI;
	
	public Circle(int r, int x, int y) {
		super(1);
		this.x[0]=x;
		this.y[0]=y;
		this.r = r;
	}
	public boolean sameCircle(Circle c) {
		if(this.x[0]==c.x[0] && this.r == c.r&& this.y[0]==c.y[0]) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public void move(int x, int y) {
		this.x[0]=x;
		this.y[0]=y;
	}
}
