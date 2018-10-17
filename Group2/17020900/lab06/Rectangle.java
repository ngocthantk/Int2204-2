package minh.dim;

public class Rectangle extends Shape{
	protected toado A;
	protected toado B;
	protected toado C;
	protected toado D;
	public Rectangle(toado a, toado b, toado c, toado d) {
		
		A = a;
		B = b;
		C = c;
		D = d;
	}
	public double Canh1() {
		double a = Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
		return a;
	}
	public double Canh2() {
		double b = Math.sqrt(Math.pow(C.getX() - D.getX(), 2) + Math.pow(C.getY() - D.getY(), 2));
		return b;
	}
	public double dientich() {
		double canh1 = Canh1();
		double canh2 = Canh2();
		return canh1*canh2;
	}
	public double chuvi() {
		double canh1 = Canh1();
		double canh2 = Canh2();
		return 2*(canh1 + canh2);
	}
}
