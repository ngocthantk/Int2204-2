package week3;

public class HomeObj {
	protected String color, floor;
	public HomeObj() {
		this.color = "yellow";
		this.floor = "Caloco cat";
	}
	public HomeObj(String setColor, int setWeight, String setfloor) {
		this.color = setColor;
		this.floor = setfloor;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getfloor() {
		return floor;
	}
	public void setfloor(String floor) {
		this.floor = floor;
	}
}