public class Student
{
	private String name;
	private String gmail;
 	private String id;
	private String group;
	public String getName()
	{
		return this.name;
	}
	public String getGmail()
	{
		return this.gmail;
	}
	public String getGroup()
	{
		return this.group;
	}
	public String getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setGroup(String group)
	{
		this.group=group;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public void setGmail(String gmail)
	{
		this.gmail=gmail;
	}
	public Student()
	{
		this.name="Student";
		this.group="INT22041";
		this.id="000";
		this.gmail="uet@vnu.vn";
	}
	public Student(String name, String id, String gmail)
	{
		this .name=name;
		this.id=id;
		this.gmail=gmail;
		this.group="INT22041";
	}
	public Student(Student s1)
	{
		this.name=s1.getName();
		this.id=s1.getId();
		this.gmail=s1.getGmail();
		this.group=s1.getGroup();
	}
	public void getInfo()
	{
		System.out.println(this.getName()+" "+this.getId()+" "+this.getGmail()+" "+this.getGroup());
	}
}
