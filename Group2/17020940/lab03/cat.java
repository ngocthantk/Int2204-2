package javatest;

public class cat {
	private String name ;
	private int age ;
	private String color ;
	public cat (String name, int age , String color ) {
		this.name = name ;
		this.age = age ;
		this.color = color ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public cat () {
		this.age = 1 ;
		this.name ="Tom";
		this.color = "blue";
	}
}
