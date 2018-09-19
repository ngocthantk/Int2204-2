package Studentmanagement;

import java.util.Scanner;

public class Studentmanagement {
public  boolean sameGroup(Student s1,Student s2) {
		if(s1.getGroup().equals(s2.getGroup())) return true;
		return false;
	}

public Student[] st=new Student[100]; 
public int Nclass;// so luong array class
public void studentsByGroup( ) {
		String lop;
		lop = st[0].getGroup();
		System.out.println(lop);
		for(int i=0;i<this.Nclass;i++) {
			if(st[i].getGroup().equals(lop)==true) {
				st[i].getInfo();
			}
		}
		
	}

public void removeStudent(String id) {
	
	for(int i=0;i<this.Nclass;i++) {
		if(this.st[i].getId().equals(id)==true) {
			for(int j=i;j<this.Nclass-1;j++) {
				this.st[i]=this.st[i+1];
			}
			this.Nclass--;
			break;
		}
	}
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentA=new Student();
		//Student studentD=new Student("dan","123","dan@");
		//studentA.getInfo();
		//studentC.getInfo();
		
		studentA.setName("dan");
		studentA.setId("123");
		studentA.setGroup("INT22041");
		studentA.setEmail("dan");
		
		Student studentB=new Student();
		//studentB.nhapDuLieu();
		studentB.setName("viet");
		studentB.setId("1234");
		studentB.setGroup("INT22041");
		studentB.setEmail("viet@");
		
		//hoc sinh c
		
		Student studentC=new Student();
		studentC.setName("tuan");
		studentC.setId("12345");
		studentC.setGroup("INT22042");
		studentC.setEmail("tuan");
		//
		
		Studentmanagement s=new Studentmanagement();
		if(s.sameGroup(studentA, studentB)==true) {
			System.out.println("co");
		}
		else 
		{
			System.out.println("khong");
		}
		//cau 11:
		s.Nclass=3; // so luong array class student la 3
		s.st[0]=studentA;
		s.st[1]=studentB;
		s.st[2]=studentC;
		s.studentsByGroup();// in ra studentA va B
		//cau 12:
		System.out.println("bai 12:");
		s.removeStudent("1234");
		for(int i=0;i<s.Nclass;i++) {
			s.st[i].getInfo();
		}
}
}