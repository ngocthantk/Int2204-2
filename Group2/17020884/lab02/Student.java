
public class Student{
	private String name,id, group, email;
	
	public Student(){
		name="Student";
		id="000";
		group="INT22041";
		email="uet@vnu.edu.vn";
	}
	
	public Student(String n, String sid, String em)
	{
		name=n;
		id=sid;
		group="INT22041";
		email=em;
	}
	
	public Student (Student s)
	{
		name=s.getName();
		id=s.getID();
		group=s.getGroup();
		email=s.getEmail();
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setID(String id)
	{
		this.id=id;
	}
	
	public void setGroup(String group)
	{
		this.group=group;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGroup()
	{
		return group;
	}
	
	public String getID()
	{
		return id;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void getInfo()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(group);
		System.out.println(email);
	}
}
