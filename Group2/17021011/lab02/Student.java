package oop;

public class Student {
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
