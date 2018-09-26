
public class BT3 {

	class Lamp {
		// determine the lamp on or off
		private boolean isOn = false;

		// turn off the lamp
		public void off() {
			isOn = false;
		}

		// turn on the lamp
		public void on() {
			isOn = true;
		}

		// set method
		void getIsOn(boolean isOn) {
			this.isOn = isOn;
		}

		// get method
		boolean getIsOn() {
			return isOn;
		}
	}

	class Dog {
		// determine breed,age,color of the dog.
		private String breed;
		private int age;
		private String color;

		// the Dog barks
		void barking() {
			System.out.println("Gooooo Gooooo Gooooo !!! Grrr");
		}

		// the Dog sleeps
		void sleeping() {
		}

		// set methods
		void setBreed(String breed) {
			this.breed = breed;
		}

		void setAge(int age) {
			this.age = age;
		}

		void setColor(String color) {
			this.color = color;
		}

		// get methods
		String getBreed() {
			return breed;
		}

		int getAge() {
			return age;
		}

		String getColor() {
			return color;
		}
	}

	class Student {
		// determine id, name of the Student
		private int id;
		private String name;

		// Constuctor
		Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		// set methods
		void setName(String name) {
			this.name = name;
		}

		void setId(int id) {
			this.id = id;
		}

		// get methods
		String getName() {
			return name;
		}

		int getId() {
			return id;
		}

	}

	class Book {
		private String title = "The magic of thinking big";
		private int pubYear = 2018; // publication year

		// set methods
		void setTitle(String title) {
			this.title = title;
		}

		void setPubYear(int pubYear) {
			this.pubYear = pubYear;
		}

		// get methods
		String getTitle() {
			return title;
		}

		int getPubYeaer() {
			return pubYear;
		}
	}

	class Pen {
		private String iColor = "blue"; // ink color
		private int cost = 5;

		// set methods
		void setIColor(String iColor) {
			this.iColor = iColor;
		}

		void setCost(int cost) {
			this.cost = cost;
		}

		// get methods
		String getIColor() {
			return iColor;
		}

		int getCost() {
			return cost;
		}

	}

	class Product {
		// determine name,price and quanlity of the Product;
		private String name = "LED Monitor";
		private double price = 2000000;
		private int quantity = 10;

		// set methods
		void setName(String name) {
			this.name = name;
		}

		void setPrice(double price) {
			this.price = price;
		}

		void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		// get methods
		String getName() {
			return name;
		}

		double getPrice() {
			return price;
		}

		int getQuantity() {
			return quantity;
		}
	}

	class Mobile {
		private String brand = "Nokia", color = "black";
		private int camera = 5; // Camera 5MG pixels

		// Call someone
		void Call(String name) {

		}

		// set methods
		void setBrand(String brand) {
			this.brand = brand;
		}

		void setColor(String color) {
			this.color = color;
		}

		void setCamera(int camera) {
			this.camera = camera;
		}

		// get methods
		String getBrand() {
			return brand;
		}

		String getColor() {
			return color;
		}

		int getCamera() {
			return camera;
		}
	}

	class Food {
		public void speak() {
			System.out.println("Eat me!");
		}
	}

	public class Bicycle {

		// the Bicycle class has two fields
		private int gear;
		private int speed;

		// set methods
		void setGear(int gear) {
			this.gear = gear;
		}

		void setSpeed(int speed) {
			this.speed = speed;
		}

		// get methods
		int getGear() {
			return gear;
		}

		int getSpeed() {
			return speed;
		}
	}

	class Box {
		double length, height, breadth; // Length,Height,Breadth of a box

		// set methods
		void setLength(double length) {
			this.length = length;
		}

		void setHeight(double height) {
			this.height = height;
		}

		void setBreadth(double breadth) {
			this.breadth = breadth;
		}

		// get methods
		double getLength() {
			return length;
		}

		double getheight() {
			return height;
		}

		double getBreadth() {
			return breadth;
		}
	}
}
