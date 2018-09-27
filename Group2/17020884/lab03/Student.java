package obj;

public class Student{
	private String name,id, classname;
	
	public Student(){
		name="Student";
		id="000";
		classname="Class";
	}
	
	public Student(String n, String sid, String c)
	{
		name=n;
		id=sid;
		classname=c;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setID(String id)
	{
		this.id=id;
	}
	
	public void setClassname(String classname)
	{
		this.classname=classname;
	}
		
	public String getName()
	{
		return name;
	}
	
	public String getClassname()
	{
		return classname;
	}
	
	public String getID()
	{
		return id;
	}
	
	public void getInfo()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(classname);
	}
}
