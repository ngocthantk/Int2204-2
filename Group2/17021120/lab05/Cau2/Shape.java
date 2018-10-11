package Cau2;

public class Shape {
	private String color = "red";
	private boolean filled = true;

	public Shape() {

	}

	public Shape(String Color, boolean Filled) {
		this.color = Color;
		this.filled = Filled;
	}

	public void setColor(String Color) {
		this.color = Color;
	}

	public void setFilled(boolean Filled) {
		this.filled = Filled;
	}

	public String getColor() {
		return this.color;
	}

	public boolean isFilled() {
		return this.filled;
	}
}
