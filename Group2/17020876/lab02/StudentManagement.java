public class StudentManagement {
	public static void main(String[] args){
//bài 6:	
		Student ten = new Student();
        ten.setName("Mai");
        ten.setId("123456");
        ten.setGroup("1");
        ten.setEmail("uet@gmail.com");
        ten.getInfo();
        System.out.println("Name is Mai");
//Bai:8		
		Student Student1 = new Student();
		Student1.getInfo();	
		
		Student Student2 = new Student("Mai","123456", "uet@gmail.com");
		Student2.getInfo();
		
		Student Student3 = new Student(Student1);
		Student3.getInfo();
//bai10:		
        Student s1 = new Student();
            s1.setName("sv1");
            s1.setId("123");
            s1.setGroup("INT22041");
            s1.setEmail("sv1@gmail.com");
			s1.getInfo();
            
		Student s2 = new Student();
            s2.setName("sv2");
            s2.setId("124");
            s2.setGroup("INT22041");
            s2.setEmail("sv2@gmail.com");
			s2.getInfo();
            
		Student s3 = new Student();
            s3.setName("sv3");
            s3.setId("125");
            s3.setGroup("INT22042");
            s3.setEmail("sv3@gmail.com");
			s3.getInfo();
		
		StudentManagement s = new StudentManagement();
		s.ktGroup(s1, s2);
		s.ktGroup(s1, s3);
		s.ktGroup(s2, s3);

	}
	public void ktGroup(Student s1, Student s2) {
		if(sameGroup(s1, s2))
			System.out.println("Cung lop");
		else
			System.out.println("Khac lop");

	}
//bài 9:
    public boolean sameGroup(Student Student1, Student Student2){
		return(Student1.getGroup().equals(Student2.getGroup()));
	}
//bài 11:
	private Student students[] = new Student[100];
//bài 12:
	public void studentsBygroup() { 
		int x = 0;
		for(int i = 0; this.students[i] != null; i++) {
			for(int j = 1; this.students[j] != null; j++) {
				x = students[j-1].getGroup().compareTo(students[j].getGroup());
				if(x > 0) {
					Student s = new Student();
					s = students[j];
					students[j] = students[j-1];
					students[j-1] = s;
				}
			}
		}
		for(int i = 0; this.students[i] != null; i++) {
			students[i].getInfo();
		}
	}
//bài 13:
	public void removeStudent(String id) {
		int x = 0, y = 0;
		for(int i = 0; this.students[i] != null; i++) {
			if(students[i].getId() == id) {
				x = i;
			}
			y = i;
		}
		for(int i = x; i < y; i++) {
			Student s = new Student();
			s = students[i];
			students[i] = students[i+1];
			students[i+1] = s;
		}
		this.students[y] = null;
	}
	
 }