
public class Student {
	// Attribute
	private String name;
 	private String email;
	private String id;
	private String group;
	
	public Student(String name, String email, String id, String group ) 
	{
		this.name =  name;
		this.email = email;
		this.id = id;
		this.group = group;
	}

	public String getName() 
	{
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() 
	{
        return this.id;
    }
    
	 public void setId(String id) {
        this.id = id;
    }

	public String getEmail()
	{
		return this.email;
	}
		
	public void setEmail(String email)
	{
		this.email = email;
	}
		
	public String getGroup()
	{
		return this.group;
	}
	
	public void setGroup(String group)
	{
		this.group = group;
	}
	
	public void getInfo() 
	{
		System.out.println("Thong tin cua sinh vien: ");
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Group: " + this.group);
		System.out.println("Email: " + this.email);
		
	}
	
	public Student ()
	{
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnua.edu.vn";
	}
	public Student(String name, String id, String email)
	{
		this.name = name;
		this.id = id;
		this.group = "INT22041";
		this.email = email;
	}
	public Student (Student s)
	{
		this.name = s.getName();
		this.id = s.getId();
		this.group = s.getGroup();
		this.email = s.getEmail();
	}
}






