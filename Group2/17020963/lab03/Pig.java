public class Pig {
	private String name;
	private String age;
	private String color;
	private int footsnumber;
	private int weight;
//ham khoi tao
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
//ham thiet lap	
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
//
	public void PrintInfo() {
		System.out.println("Lon con: " + this.name + " " +this.age + " tuoi " + "mau " + this.color + " " + this.footsnumber + " chan" + " nang " + this.weight + "kg");
	}
//	
	public void MyPig() {
		this.name = "chua nghi ra";
		this.age = "1";
		this.color = "pink";
		this.footsnumber = 4;
		this.weight = 60;
	}
//	
	public void PigSounding() {
		System.out.println("Keu ec ec ec la ");
	}
//	
	public static void main(String[] args) {
		Pig A = new Pig();
		A.MyPig();
		A.PigSounding();
		A.PrintInfo();
	}
}