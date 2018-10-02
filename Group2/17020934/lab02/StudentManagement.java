public class StudentManagement{
	private Student students[] = new Student[100];
	//
	public static boolean sameGroup(Student s1, Student s2){                  
		return s1.getGroup().equals(s2.getGroup());
	}
	//

	public void ChangeInfo(Student s1, Student s2)
	{
	   Student s3= new Student(s1);
	   s1=s2;
	   s2=s3;
	}
	public studentsByGroup()
	{
	  int k;
	  for (int i=0 ; this.students[i]!=null ;i ++)
	    for (int j=1; this.student[j]!=null;j++)
	    {
		  x=student[j-1].getGroup().compareTo(student[j].getGroup());
		  if (x>0)
		    ChangeInfo (student[j], student[j-1]);
		}
		for (int i=0 ; this.students[i]!=null ;i ++)
		student[i].getInfo();		
	}
	//
	public static void main(String[] args){
		Student s = new Student();
		s.setName("Nguyen Tuan Ngoc");
		s.setID("17020934");
		s.setGroup("INT22042");
		s.setEmail("tuanngoc1131999@gmail.com");
		String n = s.getName();
		System.out.println(s.getName());
		s.getInfo();
		
		Student s1 = new Student();
		Student s2 = new Student("aaa", "100148", "new@gmail.com");
		Student s3 = new Student(s2);
		s1.getInfo();
	 	s2.getInfo();
		s3.getInfo();	
	//
		StudentManagement sm = new StudentManagement();
		System.out.println(sm.sameGroup(s1, s2));
		System.out.println(sm.sameGroup(s1, s3));
	//
	removeStudent(String id)
	{
	int start=0;
	int end=0;
	for (int i=0 ; this.students[i]!=null; i++)
	  if (students[i].getID==id)
	   start=i;
	   end=i-1;
	 for (int i=start;i<=end;i++)
         ChangeInfo(students[i], students[i+1]);
		 this.students[end]=null;
	   
	}
	}