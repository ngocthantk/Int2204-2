package Tuan06;


public class Hexagon extends Shape {
	private int[] x1 = new int [5];
	private int[] y1 = new int [5];
	private int x0;
	private int y0;
	private int side;

	public Hexagon (int x, int y, int[] x1, int[] y1) {
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;
	}
	public int[] getX1() {
		return x1;
	}
	public void setX1(int[] x1) {
		this.x1 = x1;
	}
	public int[] getY1() {
		return y1;
	}
	public void setY1(int[] y1) {
		this.y1 = y1;
	}
//	public Hexagon(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6) {
//		this.x[0]=x1;
//		this.x[1]=x2;
//		this.x[2]=x3;
//		this.x[3]=x4;
//		this.x[4]=x5;
//		this.x[5]=x6;
//		this.y[0]=y1;
//		this.y[1]=y2;
//		this.y[2]=y3;
//		this.y[3]=y4;
//		this.y[4]=y5;
//		this.y[5]=y6;
//	}
//	public Hexagon(int x, int y, int side){
//        this.x0=x;
//        this.y0=y; 
//        this.side=side;
//        for(int i=0; i<6; i++){
//            this.x[i]=(int) (Math.cos(i*2*Math.PI/6)*this.side+x);
//            this.y[i]=(int) (Math.sin(i*2*Math.PI/6)*this.side+y);
//        }
//    }
	@Override
	public void move(int x, int y) {
//		int a = this.x - x;
//		int b = this.y - y;
		this.x = x;
		this.y = y;
//		for (int i=0; i<5; i++) {
//			x1[i] = x1[i] - a;
//			y1[i] = y1[i] - b;
//		}
	}
}
