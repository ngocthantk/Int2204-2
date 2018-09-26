package week3;

public class DogObj {
	protected String name, color, categories;
	protected int weight;
	public DogObj() {
		this.name = "Tom";
		this.color = "yellow";
		this.weight = 50;
		this.categories = "Oggy";
	}
	public DogObj(String setName, String setColor, int setWeight, String setCategories) {
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
}