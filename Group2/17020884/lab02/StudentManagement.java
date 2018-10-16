class StudentManagement{
	
	private  Student[] students = new Student[101];
	
	public boolean sameGroup(Student s1, Student s2)
	{
		if (s1.getGroup().equals(s2.getGroup()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private void studentsByGroup(String group) {
		for (int i=0; i<=100; i++)
		{
			if (students[i]!=null && students[i].getGroup()==group)
			{
				System.out.println(students[i].getName() + " " + students[i].getGroup());
			}
		}
	}
	
	private void studentsByGroup(){
		
		boolean[] isprinted = new boolean[101];
		for (int i=0; i<=100; i++)
		{
			if (isprinted[i]==false && students[i]!=null)
			{
				System.out.println(students[i].getName() + " " + students[i].getGroup());
				isprinted[i]=true;
				for (int j=i+1; j<=100; j++)
				{
				if (students[j]!=null && students[i].getGroup() == students[j].getGroup() && isprinted[j]==false)
					{
						System.out.println(students[j].getName() + " " + students[j].getGroup());
						isprinted[j]=true;
					}
				}
			}
		}
	}
	
	
	private void deleteStudent(String id) {
		for (int i=0; i<=100; i++)
		{
			if (students[i]!= null && students[i].getID()==id)
			{
				students[i]= null;
			}
		}
	}
	
	public static void main (String[] args)
	{
		StudentManagement s= new StudentManagement();
		
		s.students[0]= new Student();
		s.students[0].setName("Tran Dao Manh");
		s.students[0].setID("17020884");
		s.students[0].setGroup("INT22042");
		s.students[0].setEmail("trandaomanh1911@gmail.com");
		
		s.students[1]= new Student("B","123","B@abc.com");
		s.students[2]= new Student(s.students[1]);
		
		String a = new String("abc");
		String b = new String("abc");
		System.out.println(b);
		System.out.println(a);
		System.out.println((b==a));
		
	}
}