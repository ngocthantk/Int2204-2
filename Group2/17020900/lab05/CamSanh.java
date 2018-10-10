package minh.dim;

public class CamSanh extends Fruit {
	public CamSanh(double price, String the_origin , int date, int number) {
		super(price, the_origin, date, number);
	}
	public static void main(String[] args) {
		CamSanh CS = new CamSanh(9.0, "XYZ", 6, 4);
		System.out.println(CS.getDate());
	}

}
