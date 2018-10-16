package com.criss.model;

public class StudentManagement {
	private Student student;
	private String students[] = new String[100];

	public boolean sameGroup(Student s1, Student s2) {
		if (s1.getGroup().equals(s2.getGroup())) {
			return true;
		} else {
			return false;
		}
	}

	public void studentByGroup() {

	}

	public void removeStudent(String id) {

	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId("000");
		s1.setName("Student");
		s1.setGroup("INT22041");
		s1.setEmail("uet@vnu.edu.vn");
		System.out.println(s1.getInfor());
		System.out.println("--------------------------");

		Student s3 = new Student("Hồ Đức Thành", "15022058", "INT22041", "15022058@vnu.edu.vn");
		System.out.println("Tên sinh viên là: " + s3.getName());
		System.out.println("---------------------------");
		System.out.println(s3.getInfor());

		Student s2 = new Student("A", "001", "INT22042", "uet1@vnu.edu.vn");
		System.out.println("---------------------------");
		StudentManagement std = new StudentManagement();
		if (std.sameGroup(s1, s2) == true) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
	}

}
