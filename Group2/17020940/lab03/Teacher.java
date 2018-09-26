package javatest;

public class Teacher {
	private String name ;
	private String object ;
	private int age ;
	public Teacher (String name ,String object , int age ) {
		this.name = name ;
		this.age = age ;
		this.object= object; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
