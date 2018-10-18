package blanctuan;


public class Student {
	private String name, id, group, email;
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setId(String n) {
		id = n;
	}
	public String getId() {
		return id;
	}
	public void setGroup(String n) {
		group = n;
	}
	public String getGroup() {
		return group;
	}
	public void setEmail(String n) {
		email = n;
	}
	public String getEmail() {
		return email;
	}
	public void getInfo() {
		System.out.println(name+"\n"+id+"\n"+group+"\n"+email+"\n");
		
	}
	public Student() {
		name="Student";
		id="0000";
		group="INT22041";
		email="uet@vnu.edu.vn";
	}
	public Student(String n, String sid, String em) {
		name = n;
		id = sid;
		email = em;
		group = "INT22042";
	}
	public Student(Student s) {
		name = s.name;
		id = s.id;
		group = s.group;
		email = s.email;
	}
}

