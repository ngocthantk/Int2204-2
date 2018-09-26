package chap03.oop;

public class teacher {
	private String name="Teacher";
	private String email="teahcer@vnu.edu.vn";
	private int age = 35;
	private int exp = 10;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExp() {
		return this.exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public void getInfo() {
		System.out.println("Teacher INFO :");
		System.out.println("- Name\t\t: "+this.name);
		System.out.println("- Age\t\t: "+this.age);
		System.out.println("- Email \t: "+this.email);
		System.out.println("- Exp \t: "+this.exp);
	}
}
