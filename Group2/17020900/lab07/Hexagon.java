package minh.dim;

public class Hexagon extends Shape {
	public int x0;
	public int y0;
	public int size;
	public Hexagon(int a, int b, int c, int d, int e, int f, int g, int h, int i, int k, int l, int m) {
		super(6);
		this.x[0]=a;
		this.x[1]=b;
		this.x[2]=c;
		this.x[3]=d;
		this.x[4]=e;
		this.x[5]=f;
		this.y[0]=g;
		this.y[1]=h;
		this.y[2]=i;
		this.y[3]=k;
		this.y[4]=l;
		this.y[5]=m;
	}
	public Hexagon(int x, int y, int size){
        super(6);
        this.x0=x;
        this.y0=y; 
        this.size=size;
        for(int i=0; i<6; i++){
            this.x[i]=(int) (Math.cos(i*2*Math.PI/6)*this.size + x);
            this.y[i]=(int) (Math.sin(i*2*Math.PI/6)*this.size + y);
        }
    }
	public boolean TandF(Hexagon hexagon) {
		int num = 0;
		for (int i=0; i<6; i++) {
			if(this.x[i]==hexagon.x[i] && this.y[i]==hexagon.y[i]) {
				num++;
			}
		}
		if(num == 6) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void add(int x, int y) {
		this.x0=x;
		this.y0=y;
		for(int i=0; i<6; i++){
			this.x[i]=(int) (Math.cos(i*2*Math.PI/6)*this.size+x);
		    this.y[i]=(int) (Math.sin(i*2*Math.PI/6)*this.size+y);
		}
		
	} 

}
