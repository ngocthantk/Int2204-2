public class Student {
	private String name;
	private String id;
	private String group;
	private String email;

	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId (String id) {
		this.id = id;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup (String group) {
		this.group = group;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	
	public void getInfor() {
		System.out.println ("Name is " + name);
		System.out.println ("Id is " + id);
                System.out.println ("Group is " + group);
                System.out.println ("Email is " + email);
                }
	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(String name, String id, String email) {
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