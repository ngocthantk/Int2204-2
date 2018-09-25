public class Student
{
	
	private String name, id, group, email;
	
	public String getName() 
        {
		return name;
	}
	public void setName(String name) 
        {
		this.name = name;
	}
	public String getId() 
        {
		return id;
	}
	public void setId(String id) 
        {
		this.id = id;
	}
	public String getGroup() 
        {
		return group;
	}
	public void setGroup(String group) 
        {
		this.group = group;
	}
	public String getEmail() 
        {
		return email;
	}
	public void setEnmail(String email) 
        {
		this.email = email;
	}

	public void getInfo() 
        {
		System.out.println("Ten: " + this.name);
		System.out.println("MSSV: " + this.id);
		System.out.println("Lop: " + this.group);
		System.out.println("Email: " + this.email);
	}

	public Student() 
        {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}

	public Student(String name, String id ,String email)
         {
                this. name = name;
                this.id = id;
                this.email = email;
                this.group = "INT22041";
         }
	public Student(Student s)
         {
   	        this. name = s.name;
                this.id = s.id;
                this.email = s.email;
                this.group = s.group;
         }
}