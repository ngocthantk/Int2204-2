
public class StudentManagement {
	
	public static void main(String[] args)
	{
		Students[] ar= new Students[3];
		ar[0]= new Students("dong","01","dong@gmail.com");
		ar[1]= new Students("ngoc","02","ngoc@gmail.com");
		ar[2]= new Students();
		for(int i=0;i<3;i++)
		{
			ar[i].getIf();
			System.out.println();
		}
		
		StudentManagement s =new StudentManagement();
		if(s.sameGroup(ar[0], ar[1]))
		{
			System.out.println("Cung lop");
		}
		else System.out.println("Khac lop");
		
		StudentManagement S = new StudentManagement();
		S.StudentByGroup(ar);
		
	}
		
	public boolean sameGroup(Students s2,Students s1)
	{
		String a,b;
		a=s1.getGroup();
		b=s2.getGroup();
		if(a==b)
		{
		return true;
		}
		else return false;
	}
	
	public void StudentByGroup(Students a[])
	{
		String[] b= new String[3];
		for(int i=0;i<3;i++)
		{
			b[i]=a[i].getGroup();
		}
		
		System.out.println("INT22041");
		for(int i=0;i<3;i++)
		{
			if(b[i]=="INT22041")
			{
				String h = a[i].getName();
				System.out.println(h);
			}
		}
		System.out.println("INT22042");
		for(int i=0;i<3;i++)
		{
			if(b[i]=="INT22042")
			{
				String h = a[i].getName();
				System.out.println(h);
			}
		}
	}
}
