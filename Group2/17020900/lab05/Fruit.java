package minh.dim;

public class Fruit {
	protected double price;
	protected String the_origin;
	protected int date;
	protected int number;
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getThe_origin() {
		return the_origin;
	}

	public void setThe_origin(String the_origin) {
		this.the_origin = the_origin;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Fruit(double price, String the_origin , int date, int number) {
		this.price = price;
		this.the_origin = the_origin;
		this.date = date;
		this.number = number;
	}
}
