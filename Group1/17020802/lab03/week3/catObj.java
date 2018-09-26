package week3;

public class catObj {
	protected String name, color, categories;
	protected int weight;
	public catObj() {
		this.name = "Doraemon";
		this.color = "yellow";
		this.weight = 5;
		this.categories = "Caloco cat";
	}
	public catObj(String setName, String setColor, int setWeight, String setCategories) {
		this.name = setName;
		this.color = setColor;
		this.weight = setWeight;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static void main(String[] srgs) {
		catObj catOfMe = new catObj("Tom", "three color", 8, "Caloco cat");
		System.out.print(catOfMe.getName());
	}
}