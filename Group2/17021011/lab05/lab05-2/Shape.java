package lab052;

public class Shape {
	String color = "red";
	boolean filled = true;
	
	// COnstructor
	public Shape() {}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Setter, getter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "";
	}
	
}
