package javatest;

public class Car {
	private String name ;
	private double max_speed ;
	private String color ;
	public Car (String name , double max_speed , String color) {
		this.name = name ;
		this.max_speed = max_speed ;
		this.color = color ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(double max_speed) {
		this.max_speed = max_speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car() {
		this.color = "black";
		this.name = "BMW" ;
		this.max_speed = 200 ;
	}
}
