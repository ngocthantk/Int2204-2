package week3;

public class PenObj {
	protected String color, categories;
	protected int price;
	public PenObj() {
		this.color = "yellow";
		this.price = 5000;
		this.categories = "Bi";
	}
	public PenObj(String setColor, int setprice, String setCategories) {
		this.color = setColor;
		this.price = setprice;
		this.categories = setCategories;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
}