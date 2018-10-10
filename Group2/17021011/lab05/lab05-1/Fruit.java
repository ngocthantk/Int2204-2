package lab05;

public class Fruit {
	protected String name;
	protected String color;
	protected String nutritional;
	protected String flavor;
	
	// Constructor
	public Fruit() {
		super();
	}
	
	// Setter, getter
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

	public String getNutritional() {
		return nutritional;
	}

	public void setNutritional(String nutritional) {
		this.nutritional = nutritional;
	}
	
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	// toString
	public String toString() {
		return "Name: " + name;
	}
	
}
