package week3;

public class TableObj {
	protected String color, categories;
	protected int price;
	public TableObj() {
		this.color = "yellow";
		this.price = 1000000;
		this.categories = "Learing Table";
	}
	public TableObj(String setColor, int setprice, String setCategories) {
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