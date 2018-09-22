public class Student {
	private String name;
	private String id;
	private String group;
	private String email;

	public String getName() {
		reurn name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getId() {
		reurn id;
	}
	public void setId (String id) {
		this.id = id;
	}
	public String getGroup() {
		reurn group;
	}
	public void setGroup (String group) {
		this.group = group;
	}
	public String getEmail() {
		reurn email;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void getInfor() {
		system.out.println ("Name is ");
		system.out.println (name);
		system.out.println ("Id is ");
		system.out.println (id);
		system.out.println ("Group is ");
		system.out.println (group);
		system.out.println ("Email is ");
		system.out.println (email);
	}

	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	public Studen(String name, String id, String email) {
		this.name = name;
		this.id = id;
		this.group = "INT22041";
		this.email = email;
	}
	public Student (Student s) {
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}
	public Student (String name, String id, String group, String email) {
		this.name = name;
		this.id = id;
		this.group = group;
		this.email = email;
	}
}