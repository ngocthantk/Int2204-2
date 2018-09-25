package studentmanagement;
class StudentManagement{
	public static void main(String[] args){
		int i;
                StudentManagement sv = new StudentManagement();
		Student[] students = new Student[100];
		Student hs1 = new Student();
		Student hs2 = new Student();
		Student hs3 = new Student("dung","16022430","16022430@gmail");
		Student hs4 = new Student(hs2);
		Student sv1 = new Student();
		Student sv2 = new Student();
		Student sv3 = new Student();
		sv3.setGroup("INT22041");
		sv1.setGroup("INT22041");
		sv2.setGroup("INT22042");
		if(sv.sameGroup(sv1,sv3)){
			System.out.println("hai sv cug lop");
		}else{System.out.println("hai sv cug lop");
		}
			
		hs4.getInfo();
		hs3.getInfo();
		hs2.getInfo();
		hs1.setName("Nguyen Van Dung");
		hs1.setId ("16022430");
		hs1.setEmail("16022430@vnu.edu.vn");
		hs1.setGroup("K61N");
		System.out.println("Ho Ten: " +hs1.getName());
		hs1.getInfo();
		
}
	public boolean sameGroup(Student s1, Student s2){
		return(s1.getGroup().equals(s2.getGroup()));
			
	}
     
		
}
		