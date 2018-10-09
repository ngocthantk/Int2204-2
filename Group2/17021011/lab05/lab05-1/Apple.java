package lab05;

public class Apple extends Fruit {
	protected String origin;
	protected double price;
	
	// Constructor
	public Apple() {
		super();
		name = "Apple";
		color = "red";
		price = 30;
		origin = "China";
	}

	// Setter, getter
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Origin: " + origin);
	}
	
}
