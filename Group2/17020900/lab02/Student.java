package minh.dim;

public class Student {
	private String name,id,group,email;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void getInfo() {
		System.out.println(this.name + " " + this.id + " " + this.group + " " + this.email);
	}
	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(String name,String id,String email) {
		this.name = name;
		this.id = id;
		this.group = "INT22041";
		this.email = email;
	}
	public Student(Student s) {
		this.name = s.getName();
		this.id = s.getId();
		this.group = s.getGroup();
		this.email = s.getEmail();
	}
}
