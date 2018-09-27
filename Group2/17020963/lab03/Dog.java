public class Dog {
	private String name;
	private String age;
	private String color;
	private int footsnumber;
	private int weight;
//khoi tao
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	public int getFootsnumber() {
		return footsnumber;
	}
	public int getWeight() {
		return weight;
	}
//thiet lap	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFootnmber(int footsnumber) {
		this.footsnumber = footsnumber;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void PrintInfo() {
		System.out.println("cun con: " + this.name + " " + this.age + " tuoi " + "mau " + this.color + " " + this.footsnumber + " chan" + " nang " + this.weight + "kg");
	}
//	
	public void MyDog() {
		this.name = "chua nghi ra";
		this.age = "6";
		this.color = "yellow";
		this.footsnumber = 4;
		this.weight = 20;
	}
//	
	public void DogSounding() {
		System.out.print("Keu gau gau gau la ");
	}
//	
	public static void main(String[] args) {
		Dog A = new Dog();
		A.MyDog();
		A.DogSounding();
		A.PrintInfo();
	}
}