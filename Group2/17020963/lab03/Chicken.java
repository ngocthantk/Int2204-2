public class Chicken {
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
	public void MyChicken() {
		this.name = "chua nghi ra";
		this.age = "1";
		this.color = "Gray";
		this.footsnumber = 2;
		this.weight = 2;
	}
	public void PrintInfo() {
		System.out.println("ga mai: " + this.name + " " + this.age + " tuoi " + "mau " + this.color + " " + this.footsnumber + " chan" + " nang " + this.weight + "kg");
	}
//	
	public void ChickenSounding() {
		System.out.println("Keu cuc ta cuc tac la ");
	}
//	
	public static void main(String[] args) {
		Chicken A = new Chicken();
		A.MyChicken();
		A.ChickenSounding();
		A.PrintInfo();
	}
}