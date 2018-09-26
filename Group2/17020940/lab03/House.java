package javatest;

public class House {
	private String color ;
	private int floor ;
	public House (String color , int floor) {
		this.color =color ;
		this.floor = floor ;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public House () {
		this.color = "yelow";
		this.floor = 2 ;
	}
}
