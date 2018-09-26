public class StudentManagement {
	public static void main (String[] args) {
            /*
		Student my = new Student();
		my.setName("Trinh");
		my.setId("17021082");
		my.setGroup("C-C");
		my.setEmail("buithikieutrinh1999@gmail.com");
		System.out.println(my.getName());
		my.getInfor();

*/
		Student my = new Student();
		my.getInfor();
		Student Sv2 = new Student ("Trinh", "17021082", "buithikieutrinh1999@gmail.com");
		Sv2.getInfor();
		Student Sv3 = new Student (my);
		Sv3.getInfor();


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
			System.out.println("Cung lop");
		else
			System.out.println("Khac lop");
	}


	public boolean sameGroup(Student Student1, Student Student2) {
		return (Student1.getGroup().equals(Student2.getGroup()));
	}

	
	private Student students[] = new Student[100];
}