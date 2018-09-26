package com.criss.model;

public class Student {
	private String name, id, group, email;

	public Student(String name, String id, String group, String email) {
		super();
		this.name = name;
		this.id = id;
		this.group = group;
		this.email = email;
	}

	public Student(Student s) {
		name = s.name;
		id = s.id;
		group = s.group;
		email = s.email;

	}

	public Student() {
		super();
	}

	public String getInfor() {
		return "Student [Tên: " + name + ", Mã học sinh: " + id + ", Lớp: " + group + ", Email: " + email + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
