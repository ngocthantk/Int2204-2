public class StudentManagement
{
	public Student st[] =new Student[100];
	public int total=0;
	
	public static void main(String[] args)
	{
		Student s1= new Student();
		s1.setName("Hung");
		s1.setGmail("hoadongbg@gmail.com");
		s1.setId("17020794");
		s1.setGroup("INT22041");
		System.out.println(s1.getName());
		Student s2= new Student("Hung","hoadongbg@gmail.com","17020794");
		s2.getInfo();
		Student s3=new Student(s1);
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		s4.setGroup("INT22041");
		s5.setGroup("INT22041");
		s6.setGroup("INT22042");
		StudentManagement SM=new StudentManagement();
		System.out.println(SM.sameGroup(s4,s5));
		System.out.println(SM.sameGroup(s5,s6));
	}
	public boolean sameGroup(Student s1, Student s2)
	{
		boolean check=false;
		if(s1.getGroup()==s2.getGroup())
		{
			check=true;
		}
		return check;
	}
	public void studentByGroup()
	{
		int k=0;
		while(this.st[k]!=null)
		{
			k++;
			this.total++;
		}
		for(int i=0; i<this.total; i++)
		{
			for(int j=0; j<this.total-1; j++)
			{
				if(this.st[i].getGroup().compareTo(this.st[j].getGroup())>0)
				{
					Student group;
					group=this.st[i];
					this.st[i]=this.st[j];
					this.st[j]=group;
					
				}
					
			}
		}
		String nameGroup=this.st[0].getGroup();
		System.out.println(this.st[0].getGroup());
		for(int i=0; i<this.total; i++)
		{
			if(this.st[i].getGroup()==nameGroup)
			{
				System.out.println(this.st[i].getName());
			}
			if(this.st[i].getGroup()!=nameGroup)
			{
				System.out.println(this.st[i].getGroup());
				nameGroup=this.st[i].getGroup();
				System.out.println(this.st[i].getName());
			}

		}
		
	}
	
	public void removeStudent (String id)
	{
		int k=0;
		int fl=0;
		this.total=0;
		while(this.st[k]!=null)
		{
			k++;
			this.total++;
		}
		for(int i=0; i<this.total; i++)
		{
			if(this.st[i].getId()==id)
			{
				fl=i;
			}
		}

		for(int i=fl; i<this.total; i++)
		{
			this.st[i]=this.st[i+1];
		}
	}
	
}