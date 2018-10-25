package lab06;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	public Square (double x,double y,double length ) {
		super(x,y,length,length);
	}
	public boolean equalSquare(Shape s) {
		if (s instanceof Square) {
			return (this.getP().equals(((Square) s).getP()) && this.getH()==((Square)s).getH());
		}
		else return false;
	}
}
