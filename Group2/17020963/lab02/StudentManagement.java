public class StudentManagement {
	public static void main (String[] args) {
// bài 6:
/*		Student Student1 = new Student();
		Studen1.setName("Phuc");
		Student1.setId("sv001");
		Student1.setGroup("IE2");
		Student1.setEmail("phuc070899@gmail.com");
		System.out.println(Student123.getName());
		Student1.getInfo();*/
//bài 7+8:	
		Student Student1 = new Student();
		Student1.getInfo();
		
		Student Student2 = new Student("Phuc","000", "phuc070899@gmail.com");
		Student2.getInfo();
		
		Student Student3 = new Student(Student1);
		Student3.getInfo();
//bài 10:
		Student s1 = new Student("sv1", "17020963", "INT22041", "sv1@vnu.edu.vn");
		Student s2 = new Student("sv2", "17020964", "INT22041", "sv2@vnu.edu.vn");
		Student s3 = new Student("sv3", "17020965", "INT22042", "sv3@vnu.edu.vn");
		StudentManagement s = new StudentManagement();
		s.checkGroup(s1, s2);
		s.checkGroup(s1, s3);
		s.checkGroup(s2, s3);
	}
	public void checkGroup(Student s1, Student s2) {
		if(sameGroup(s1, s2))
			System.out.println("Hoc cung lop");
		else
			System.out.println("Hoc khac lop");
	}
// bài 9:
	public boolean sameGroup(Student Student1, Student Student2) {
		return(Student1.getGroup().equals(Student2.getGroup()));
	}
//
// bài 11:
	private Student students[] = new Student[100];
// bài 12:
	public void changeInfo(Student s1, Student s2){
		Student s = new Student(s1);
		s1 = s2;
		s2 = s;
	}
	public void studentsBygroup() { 
		int x = 0;
		for(int i = 0; this.students[i] != null; i++)
		{
			for(int j = 1; this.students[j] != null; j++) {
				x = students[j-1].getGroup().compareTo(students[j].getGroup());
				if(x > 0)
					changeInfo(students[j], students[j-1]);
			}
		}
		for(int i = 0; this.students[i] != null; i++)
			students[i].getInfo();
	}
// bài 13:
	public void removeStudent(String id) {
		int x = 0, y = 0;
		for(int i = 0; this.students[i] != null; i++) {
			if(students[i].getId() == id)
				x = i;
			y = i;
		}
		for(int i = x; i < y; i++)
			changeInfo(students[i], students[i+1]);
		this.students[y] = null;
	}
	
}
