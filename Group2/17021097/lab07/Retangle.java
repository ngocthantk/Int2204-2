package tu.phamanh;

public class Retangle extends Shape {
	
	public Retangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super(4);
		this.x[0]=x1;
		this.x[1]=x2;
		this.x[2]=x3;
		this.x[3]=x4;
		this.y[0]=y1;
		this.y[1]=y2;
		this.y[2]=y3;
		this.y[3]=y4;
	} 
	public boolean sameRetangle(Retangle t) {
		int count = 0;
		for (int i=0; i<4; i++) {
			if(this.x[i]==t.x[i] && this.y[i]==t.y[i]) count ++;
		}
		if(count == 4) return true;
		else return false;
	}
	@Override
	public void move(int x, int y) {
		this.x[0]+=x;
		this.x[1]+=x;
		this.x[2]+=x;
		this.x[3]+=x;
		this.y[0]+=y;
		this.y[1]+=y;
		this.y[2]+=y;
		this.y[3]+=y;
	}
}
