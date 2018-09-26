class myInfor{
	private int age;
	private String name, school;
	public myInfor(int age, String name, String school) {
		this.age = age;
		this.name = name;
		this.school = school;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void print() {
		System.out.printf("Name: %s\nAge: %d\nSchool: %s",name,age,school);
	}
}

class Cat {
	private String sex,name;
	private String color;
	// constructor
	public Cat(String sex, String name, String color) {
		this.sex = sex;
		this.name = name;
		this.color = color;
	}
	//getter,setter
	
	public String getSex() {
		return sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean equalsSex(Cat c1) {
		return this.sex.equals(c1.getSex());
	}
	public void print() {
		System.out.printf("Name: %s\nAge: %d\nSex: %s\n");
	}
}
class student{
	private String name, sex, ID;
	private int DoB;
	public student(String name, String sex, String iD, int doB) {
		this.name = name;
		this.sex = sex;
		ID = iD;
		DoB = doB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getDoB() {
		return DoB;
	}
	public void setDoB(int doB) {
		DoB = doB;
	}
	public void print() {
		System.out.printf("Name: %s\nAge: %d\nID: %s\nSex: %s\nDateofBirth: %d\n");
	}
}
class Square {
	private double a;
 	public Square(double a) {
		this.a = a;
	}
 	public double getA() {
		return a;
	}
 	public void setA(double a) {
		this.a = a;
	}
	
	public double C() {
		return 4*a;
	}
	
	public double S() {
		return a*a;
	}
}
class Student {
	private String name;
	private String id;
	private String group;
	private String email;
	
	// Constructor
	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	
	public Student(String n, String sid, String em) {
		this.name = n;
		this.id = sid;
		this.email = em;
		this.group = "INT22041";
	}
	
	public Student(Student s) {
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}
	
	// getName, setName
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// getID, setID
	public String getID() {
		return this.id;
	}
	public void setID(String id) {
		this.id = id;
	}
	
	// getGroup, setGroup
	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	// getEmail, setEmail
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getInfo
	public String getInfo() {
		return ("Name: " + this.name + "\n" + "ID: " + this.id + "\n" + "Group: " + this.group + "\n" + "Email: " + this.email + "\n");
	}
}
class Book {
	private String ID;
	private String name;
	private double price;
	
	public Book(String ID, String name, double price) {
		this.setID(ID);
		this.setName(name);
		this.setPrice(price);
	}
	public String getID() {
		return this.ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void showInfo() {
		System.out.println("Book Info: ");
		System.out.println("- ID \t\t:" + this.getID());
		System.out.println("- Name \t\t:" + this.getName());
		System.out.println("- Price \t:" + this.getPrice());
	}
}
class BankAccount {
	private String name;
	private String password;
	private double balance;
	
	// Constructor
	public BankAccount(String name, String password) {
		this.name = name;
		this.password = password;
		this.balance = 0;
	}
	
	// Getter, setter
	public String getName() {
		return name;
	}
 	public void setName(String name) {
		this.name = name;
	}
 	public String getPassword() {
		return password;
	}
 	public void setPassword(String password) {
		this.password = password;
	}
 	public double getBalance() {
		return balance;
	}
 	// Methods
	public void deposit(double d) {
		balance += d;
	}
	
	public boolean withdraw(double d) {
		if(d > balance) {
			System.out.println("Fail");
			return false;
		}
		else {
			balance -= d;
			return true;
		}
	}
	
}
class Dog {
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
