package minh.dim;

public class Car {
	private String name;
	private int price;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int x) {
		this.price = x;
	}
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void xuat() {
		System.out.println(this.name + " "  + this.price);
	}
	public static void main(String[] args) {
		
	}

}
