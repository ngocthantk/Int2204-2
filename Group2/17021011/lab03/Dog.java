package lab03;

public class Dog {
	private String name;
	private int age;
	private String color;

	// Constructor
	public Dog(){};
	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	// Getter, setter
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
	
	// Behaviors
	public void sleep() {
		System.out.println(this.name + " is sleeping !");
	}
	
	public void eat() {
		System.out.println(this.name + " is eating !");
	}
	
	public void bark() {
		System.out.println(this.name + " is barking !");
	}
	
	public void chaseCat() {
		System.out.println(this.name + " is chasing !");
	}
}
