package week3;

public class TreeObj {
	protected String color, categories;
	public TreeObj() {
		this.color = "yellow";
		this.categories = "Caloco cat";
	}
	public TreeObj(String setColor, int setprice, String setCategories) {
		this.color = setColor;
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
}