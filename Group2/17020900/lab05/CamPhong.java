package minh.dim;

public class CamPhong extends Fruit {
	public CamPhong(double price, String the_origin , int date, int number) {
		super(price, the_origin, date, number);
	}
	public static void main(String[] args) {
		CamPhong CP = new CamPhong(6.0, "abc", 9, 2);
		System.out.println(CP.getThe_origin());

	}
}
