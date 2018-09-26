public class Student{
	
	private	String name, id, group, email;
	
	public Student()
	 {
		name = "Student";
		id = "000";
		group = "INT22041";
		email ="uet@vnu.edu.vn";
	 }
	public Student(String n, String i, String em)
	 {
		name = n;
		id = i;
		email = em;
		group = "INT22041";
	 }
	public Student(Student s)
	 {
		name = s.getName();
		id = s.getId();
		group = s.getGroup();
		email = s.getEmail();
 	 }
	public	String getName() {return name;}
	public	String getId()	 {return id;}
	public	String getGroup(){return group;}
	public	String getEmail(){return email;}
	public	void setName(String s)	{ name  = s;}
	public	void setId(String s)	{ id    = s;}
	public	void setGroup(String s)	{ group = s;}
	public	void setEmail(String s)	{ email = s;}

	public	void getInfo()
	 {
	 	System.out.println(name +'\n'+ id+'\n'+ group+'\n'+ email);
		System.out.println("---------------------------------------");
	 }
		
}