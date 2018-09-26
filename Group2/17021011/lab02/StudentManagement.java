package oop;

public class StudentManagement {
	Student[] students = new Student[100];
	int size = 0;
	
	public void studentsByGroup() {
		boolean[] check = new boolean[size];
		for(int i=0; i<size; i++) {
			if(!check[i]) {
				System.out.printf("===== GROUP %s =====%n", students[i].getGroup());
				for(int j=i; j<size; j++) {
					if(sameGroup(students[i], students[j])) {
						System.out.println(students[j].getInfo());
						check[j] = true;
					}
				}
			}
		}
	}
	
	public void removeStudent(String id) {
		for(int i=0; i<size; i++) {
			if(students[i].getID().equals(id)) {
				for(int j=i; j<size-1; j++) {
					students[j] = students[j+1];
				}
				size--;
				return;
			}
		}
	}
	
	public boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup().equals(s2.getGroup());
	}
	
	public static void main(String[] args) {
		StudentManagement manage = new StudentManagement();
		Student my = new Student("LAI QUANG THAI","17021011","my@gmail.com");
		my.setGroup("K62-CC");
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student("NGUYEN VAN A","001","account1@gmail.com");
		st3.setGroup("K62-CC");
		Student st4 = new Student(st1);
		manage.students[manage.size++] = my;
		manage.students[manage.size++] = st1;
		manage.students[manage.size++] = st2;
		manage.students[manage.size++] = st3;
		manage.students[manage.size++] = st4;
		manage.studentsByGroup();
		manage.removeStudent("17021011");
		manage.studentsByGroup();
	}
}
