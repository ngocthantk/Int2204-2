public class StudentManagement {
	public static void main (String[] args) {
		Student Student1 = new Student();
		Student1.setName("Trinh");
		Student1.setId("17021082");
		Student1.setGroup("C-C");
		Student1.setEmail("buithikieutrinh1999@gmail.com");
		system.out.println(Student123.getName());
		Student1.getInfo();


		Student Student1 = new Student();
		Student1.getInfo();
		Student Student2 = new Student ("Trinh", "17021082", "buithikieutrinh1999@gmail.com");
		Student2.getInfo();
		Student Student3 = new Student (Student1);
		Student3.getInfo();


		Student sv1 = new Student ("sv1", "17021082", "INT22041", "sv1@vnu.edu.vn");
		Student sv2 = new Student ("sv2", "17021083", "INT22041", "sv2@vnu.edu.vn");
		Student sv3 = new Student ("sv3", "17021084", "INT22042", "sv3@vnu.edu.vn");
		StudentManagement s = new StudentManagement();
		s.ktGroup(sv1, sv2);
		s.ktGroup(sv2, sv3);
		s.ktGroup(sv3, sv1);		
	}
	public void ktGroup(Student sv1, Student sv2) {
		if (sameGroup(sv1, sv2))
			system.out.println("Cung lop");
		else
			system.out.println("Khac lop");
	}


	public boolean sameGroup(Student Studnet1, Studnet Student2) {
		return (Student1.getGroup().equals(Student2.getGroup()));
	}

	
	private Student students[] = new Student[100];
}