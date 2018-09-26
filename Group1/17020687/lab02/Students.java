
public class Students {
	private String Name;
	private String Id;
	private String Group;
	private String Email;
	
	public Students(String a, String b, String c)
	{
		this.Name = a;
		this.Id = b;
		this.Group = "INT22041";
		this.Email = c;
	}
	
	public Students()
	{
		this.Name="Pham Ngoc Dong";
		this.Id="1702793";
		this.Group="INT22042";
		this.Email="dongpham213@gmail";
	}
	public Students(Students a)
	{
		this.Name=a.Name;
		this.Id=a.Id;
		this.Group=a.Group;
		this.Email=a.Email;
	}
	//Set
	public void setName(String name)
	{
		Name=name;
	}
	
	public void setId(String id)
	{
		Id=id;
	}
	
	public void setGroup(String gr)
	{
		Group=gr;
	}
	
	public void setEmail(String em)
	{
		Email=em;
	}
	// get
	public String getName()
	{
		return Name;
	}
	public String getId()
	{
		return Id;
	}
	public String getGroup()
	{
		return Group;
	}
	public String getEmail()
	{
		return Email;
	}
	
	
	public void getIf()
	{
		System.out.println("Ho va ten:"+Name);
		System.out.println("Ma so Sinh Vien:"+Id);
		System.out.println("Lop:"+Group);
		System.out.println("Email:"+Email);
	}
	

}
