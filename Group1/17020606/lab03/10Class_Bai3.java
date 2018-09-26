public class Person{
	//class nguyen thuy
	private String name,address;
	private int Age;
	public Person (String name,int Age, String address){
		this.name = name;
		this.Age = Age;
		this.address = address;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int Age){
		this.age = age;
	}
	public void setAdd(String address){
		this.address = address;
	}
	public int getAge(){
		return Age;
        }
	public String getName(){
		return name;
	}
	public String getAdd(){
	    return address;
	}
	public void getInfo(){
		System.out.println("The person's information is: ");
		System.out.println("Name: " + name + " Age: " + age + " Address: " + address);
	}
}
public class Student extends Person{
	//class Person la class cha cua Student
	private String grade;
	private float AveragePoint;
	public Student(String name, int Age, String address, String grade, float point){	
		super(name,Age,address);//goi ham khoi tao cua lop cha
		this.grade = grade;
		this.AveragePoint = point;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}
	public void setPoint(String point){
		this.AveragePoint = point;
	}
	public String getGrade(){
		return grade;
	}
	public float getPoint(){
		return AveragePoint;
	}
	@Override
	public void getInfo(){
		super.getInfo();//ghi de phuong thuc
		System.out.println("Grade:" + grade + " AveragePoint: " + AveragePoint);
	}
}
public class Employee extends Person{
	//tuong tu nhu class Student
	private String company;
	private int workMonth;
	private int salary;
	public Employee(String name, int Age, String address, String company, int workMonth, int salary){
		super(name,Age,address);
		this.company = company;
		this.workMonth = workMonth;
		this.salary = salary;
	}
	public void setCom(String company){
		this.company = company;
	}
	public void setMonth(int month){
		this.workMonth = month;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public String getCom(){
		return company;
	}
	public int getMonth(){
		return workMonth;
	}
	public int getSalary(){
		return salary;
	}
	@Override
	public void getInfo(){
		super.getInfo();
		System.out.println("Company: " + company + " Month worked: " + workMonth + " Salary: " + salary);
	}
}
public class Coder extends Employee{
	private String codeLanguage;//ngon ngu lap trinh yeu thich
	public Coder(String name, int Age, String address, String company, int workMonth, int salary, String code){
		super(name,Age,address,company,workMonth,salary);
		this.codeLanguage = code;
	}
	public setCode(String code){
		this.codeLanguage = code;
	}
	public String getCode(){
		return codeLanguage;
	}
	@Override
	public void getInfo(){
		super.getInfo();
		System.out.println("Favorite code language: " + codeLanguage);
	}
}
public class Doctor extends Employee{
    private String expert;//chuyen khoa gi do
    public Doctor(String name, int Age, String address, String company, int workMonth, int salary, String expert){
		 super(name,Age,address,company,workMonth,salary);
		 this.expert = expert;
	}
	public void setExpert(String expert){
		this.expert = expert;
	}
	public String getExpert(){
		return expert;
	}
	@Override
	public void getInfo(){
		super.getInfo();
		System.out.println("Experts : " + expert);
	}
}
public class Soldier extends Person{
	private String army;
	private int yearServed;
	private String badge;
	public Soldier(String name, int Age, String address, String army, int yearServed, String badge){
		super(name,Age,address);
		this.army = army;
		this.yearServed = yearServed;
		this.badge = badge;
	}
	public void setArmy(String army){
		this.army = army;
	}
	public void setYear(String years){
		this.yearServed = years;
	}
	public void setBadge(String badge){
		this.badge = badge;
	}
	public String getArmy(){
		return army;
	}
	public int getYear(){
		return yearServed;
	}
	public String getBadge(){
		return badge;
	}
	@Override
	public void getInfo(){
		super.getInfo();
		System.out.println("Army: " + army + " Years served: " + yearServed + " Badge: " + badge);
	}
}
public class Animal{
	private String name;
	private int age;
	public Animal(String name, int age){
        this.name = name;
		this.age = age;
	}	
}
public class Dog{
	private String place;
	public Dog(String name, int age, String place){
			super(name,age);
			this.place = place;
	}
	public void Say(){
		System.out.println("Woop !!!");
	}
}
public class Cat{
	private String place;
	public Dog(String name, int age, String place){
			super(name,age);
			this.place = place;
	}
	public void Say(){
		System.out.println("Meow !!!");
	}
}