package Lab07;

public class Triangle extends Shape{

	public Triangle(int xA, int yA, int xB, int yB, int xC, int yC) {
		super(3);
		this.x[0]=xA;
		this.x[1]=xB;
		this.x[2]=xC;
		this.y[0]=yA;
		this.y[1]=yB;
		this.y[2]=yC;
	}
	public boolean sameTriangle(Triangle t) {
		int count = 0;
		for (int i=0; i<3; i++) {
			if(this.x[i]==t.x[i] && this.y[i]==t.y[i]) count ++;
		}
		if(count == 3) return true;
		else return false;
	}
	

	@Override
	public void move(int x, int y) {
		this.x[0]+=x;
		this.x[1]+=x;
		this.x[2]+=x;
		this.y[0]+=y;
		this.y[1]+=y;
		this.y[2]+=y;	
	}
}
