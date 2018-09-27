package week3;

public class PcObj {
	protected String name, color, categories;
	protected int price;
	public PcObj() {
		this.name = "Asus";
		this.color = "yellow";
		this.price = 8000000;
		this.categories = "Labtop";
	}
	public PcObj(String setName, String setColor, int setprice, String setCategories) {
		this.name = setName;
		this.color = setColor;
		this.price = setprice;
		this.categories = setCategories;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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