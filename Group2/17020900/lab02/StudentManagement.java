package minh.dim.test;

import minh.dim.Student;

public class StudentManagement {
	private Student[] students = new Student[100];
	
	public void studentsByGroup() {
		
		String [] tencaclop = new String[100];
		tencaclop[0] = students[0].getGroup();
		int solop = 1;
		for(int i = 1;i < students.length;i++) {
			if(tencaclop[0] != students[i].getGroup()) {
				tencaclop[solop] = students[i].getGroup();
				solop++;
			}
		}
		
		for(int i = 0;i < solop;i++) {
			for(int j = 0;j < students.length;j++) {
				if(tencaclop[i].equals(students[j].getGroup())) {
					System.out.println(students[i].getName());
				}
			}
		}
		
	}
	public void removeStudent(String id) {
		for(int i = 0;i < students.length;i++) {
			if(students[i].getId().equals(id)) {
				for(int j = i;i < students.length - 1;i++) {
					students[i] = students[i + 1];
				}
			}
		}
	}
	public boolean sameGroup(Student s1,Student s2) {
		
			return (s1.getGroup() == s2.getGroup());
		
			
		
	}
	public static void main(String[] args) {
		StudentManagement lop = new StudentManagement();
		/*
		Student SinhVien = new Student();
		SinhVien.setName("Minh");
		SinhVien.setId("17020900");
		SinhVien.setGroup("k62IE2");
		SinhVien.setEmail("nguyenvanminhhy99@gmail.com");
		System.out.println("tên Sinh viên: " + SinhVien.getName());
		SinhVien.getInfo();
		*/
		
		/*
		Student sva = new Student();
		sva.getInfo();
		Student svb = new Student("Minh", "17020900", "nguyenvanminhhy99@gmail.com");
		svb.getInfo();
		Student svc = new Student(svb);
		svc.getInfo();
		*/
		
		Student a = new Student();
		a.setGroup("INT22041");
		Student b = new Student();
		b.setGroup("INT22041");
		Student c = new Student();
		c.setGroup("INT22042");
		System.out.println(lop.sameGroup(a, b));
		System.out.println(lop.sameGroup(b, c));
		System.out.println(lop.sameGroup(a, c));
		
		
		
	}

}
