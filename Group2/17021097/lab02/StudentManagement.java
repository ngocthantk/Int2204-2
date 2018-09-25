
public class StudentManagement
{
	private Student[] students = new Student[100];
	public void removeStudent(String id) {
		for(int i = 0;i < students.length;i++) {
			if(students[i].getId().equals(id)) {
				for(int j = i;j < students.length - 1;j++) {
					students[j] = students[j + 1];
				}
			}
		}
	}
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
	public static void main(String[] agrs) 
	{
		StudentManagement lop = new StudentManagement();
		Student student = new Student();
		student.getInfo();

		Student mine = new Student("Tu","17021097","phamanhtu242@gmail.com");
		mine.getInfo();
	
		Student mine2 = new Student(mine);
		mine2.getInfo();
		Student one = new Student();
	 	one.setGroup("INT22041");
	 	Student two = new Student();
	 	two.setGroup("INT22041");
	 	Student three = new Student();
	 	three.setGroup("INT22042");
	 	System.out.println(lop.sameGroup(one,two));
	 	System.out.println(lop.sameGroup(one,three));
	 	System.out.println(lop.sameGroup(three,two));
	}
 	public boolean sameGroup(Student s1, Student s2)
 	{
 		if (s1.getGroup() == s2.getGroup())
 		{
 			return true;
 		}
 		else 
		{
 			return false;
 		}
 	}
 	
}
