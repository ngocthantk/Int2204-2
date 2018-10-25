package Diagram;

public class Hexagon extends Shape {
	public int x0;
	public int y0;
	public int side;
	public Hexagon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6) {
		super(6);
		this.x[0]=x1;
		this.x[1]=x2;
		this.x[2]=x3;
		this.x[3]=x4;
		this.x[4]=x5;
		this.x[5]=x6;
		this.y[0]=y1;
		this.y[1]=y2;
		this.y[2]=y3;
		this.y[3]=y4;
		this.y[4]=y5;
		this.y[5]=y6;
	}
	
	public Hexagon(int x, int y, int side){
        super(6);
        this.x0 = x;
        this.y0 = y; 
        this.side = side;
        for(int i=0; i<6; i++){
            this.x[i]=(int) (Math.cos(i*2*Math.PI/6)*this.side+x);
            this.y[i]=(int) (Math.sin(i*2*Math.PI/6)*this.side+y);
        }
	}
	
    public boolean sameHexagon(Hexagon t) {
    	int count = 0;
		for (int i=0; i<6; i++) {
			if(this.x[i]==t.x[i] && this.y[i]==t.y[i]) count ++;
		}
		if(count == 6) return true;
		else return false;
	}
    
    @Override
	public void move(int x, int y) {
		this.x0 = x;
		this.y0 = y;
		for(int i=0; i<6; i++){
			this.x[i]=(int) (Math.cos(i*2*Math.PI/6)*this.side+x);
		    this.y[i]=(int) (Math.sin(i*2*Math.PI/6)*this.side+y);
		}
		
	} 
}
