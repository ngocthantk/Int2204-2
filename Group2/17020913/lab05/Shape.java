package KeThua_2;

public class Shape {
	public String color="red";
	public Boolean filled= true;
	public Shape() {};
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		
	}
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
	@Override
	public String toString() {
		
		return this.color + "," + this.filled;
		
	}
	
}
