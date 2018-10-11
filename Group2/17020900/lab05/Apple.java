package minh.dim;

public class Apple extends Fruit {
	public Apple(double price, String the_origin , int date, int number) {
		super(price, the_origin, date, number);
	}
	public static void main(String[] args) {
		Apple A = new Apple(5.5, "xyz",10, 6);
		System.out.println(A.getNumber());
	}
}
