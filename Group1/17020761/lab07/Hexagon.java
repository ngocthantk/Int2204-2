package lab06;

public class Hexagon extends Shape{
	protected point top1;
	protected point top2;
	protected point top3;
	protected point top4;
	protected point top5;
	protected point top6;
	public point getTop1() {
		return top1;
	}
	public void setTop1(point top1) {
		this.top1 = top1;
	}
	public point getTop2() {
		return top2;
	}
	public void setTop2(point top2) {
		this.top2 = top2;
	}
	public point getTop3() {
		return top3;
	}
	public void setTop3(point top3) {
		this.top3 = top3;
	}
	public point getTop4() {
		return top4;
	}
	public void setTop4(point top4) {
		this.top4 = top4;
	}
	public point getTop5() {
		return top5;
	}
	public void setTop5(point top5) {
		this.top5 = top5;
	}
	public point getTop6() {
		return top6;
	}
	public void setTop6(point top6) {
		this.top6 = top6;
	}
	
	
	@Override
	public boolean check() {
		if(top1==top2 || top2==top3 || top3==top1) {
			return false;
		}
		return true;
	}
	@Override
	public boolean equals(Object a) {
		if(a instanceof Hexagon && this.top1 == ((Hexagon) a).getTop1() 
				&& this.top2 == ((Hexagon) a).getTop2() && this.top3 == ((Hexagon) a).getTop3()
				&& this.top4 == ((Hexagon) a).getTop4() && this.top5 == ((Hexagon) a).getTop5() 
				&& this.top6 == ((Hexagon) a).getTop6() 
					) {
				return true;
			}
			return false;
	}
	@Override
	public void move(double a, double b) {
		// TODO Auto-generated method stub
		top1.moveP(a, b);
		top2.moveP(a, b);
		top3.moveP(a, b);
		top4.moveP(a, b);
		top5.moveP(a, b);
		top6.moveP(a, b);
	}
}
