package minh.dim;

public class Orange extends Fruit {

	public Orange(double price, String the_origin , int date, int number) {
		super(price, the_origin, date, number);
	}
	public static void main(String[] args) {
		Orange O = new Orange(5, "the_origin", 1, 0);
		System.out.println(O.getPrice());
	}
}
