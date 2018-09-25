package chap02.oop;

public class StudentManagement {
//	bai 6
	public static void main(String[] args) {
		Student StudentOne = new Student();
		StudentOne.setName("Hoang");
		StudentOne.setId("17020761");
		StudentOne.setGroup("INT22041");
		StudentOne.setEmail("huyhoang.ttw@gmail.com");
		
//		in ten cua sv
//		System.out.println(Studentone.getName());
//		in cac thong tin cua sv
		StudentOne.getInfo();
	}
	
	
// bai 8
	public static void main1(String[] args) {
//		7 a:
		Student StudentTwo = new Student();
		StudentTwo.getInfo();
// 		7 b:
		Student StudentThree = new Student("Hoang","17020761","huyhoang.ttw@gmail.com");
		StudentThree.getInfo();
//		7 c:
		Student s = new Student(StudentTwo);
		s.getInfo();	
	}
	
	
//	bai 9:
	
	public static void main2(String[] args) {
		Student s1 = new Student("sv1","17020761","INT22041","sv1@vnu.edu.vn");
		Student s2 = new Student("sv2","17020762","INT22042","sv2@vnu.edu.vn");
		Student s3 = new Student("sv3","17020763","INT22041","sv3@vnu.edu.vn");
		StudentManagement s =new StudentManagement();
		s.result(s1,s2);
		s.result(s1,s3);
		s.result(s2,s3);
	}
	public void result(Student s1,Student s2) {
		if(sameGroup(s1,s2)) {
			System.out.println(s1.getName() + " va " + s2.getName() + " hoc cung lop");
		} else {
			System.out.println(s1.getName() + " va " + s2.getName() + " hoc khac lop");
		}
	}
	public boolean sameGroup(Student s1, Student s2) {
		if(s1.getGroup().equals(s2.getGroup())) {
			return true;
		}
		return false;
	}
	
//	bai 11,12,13:
	public Student students[] = new Student[100];
	public void changeInfo(Student s1,Student s2) {
		Student k = new Student(s1);
		s1.setName(s2.getName());
		s1.setId(s2.getId());
		s1.setGroup(s2.getGroup());
		s1.setEmail(s2.getEmail());
		s2.setName(k.getName());
		s2.setId(k.getId());
		s2.setGroup(k.getGroup());
		s2.setEmail(k.getEmail());
	}
	public void studentsByGroup() {
		StudentManagement s =new StudentManagement();
		int x = 0;
		for(int i=1;this.students[i]!=null;i++) {
			for(int j=1;this.students[j]!=null;j++) {
				x =students[j-1].getGroup().compareTo(students[j].getGroup());
				if(x>0) {
					s.changeInfo(students[j-1],students[j]);
				}
			}
		}
		for(int i=0;this.students[i]!=null;i++) {
			students[i].getInfo();
		}
	}
	public void removeStudent(String id) {
		StudentManagement s =new StudentManagement();
		int x=0,y=0;
		for(int i=0;this.students[i]!=null;i++) {
			if(students[i].getId()==id) {
				x=i;
			}
			y=i;
		}
		s.changeInfo(students[x], students[y]);
		this.students[y]=null;
	}
}

