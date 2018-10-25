package lap07;

public class Circle extends Shape {
	public int radian;
	public final double PI = Math.PI;
	
	public Circle(int radian, int x, int y) {
		super(1);
		this.x[0]=x;
		this.y[0]=y;
		this.radian = radian;
	}
	public boolean sameCircle(Circle c) {
		if(this.x[0]==c.x[0] && this.radian == c.radian) {
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
