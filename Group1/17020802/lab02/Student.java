
public class Student {
	protected String name, id, group, email;
	public Student() {
		setInfo("Student", "000", "INT22041", "uet@vnu.edu.vn");
	}
	public Student(String setName, String setId, String setGroup, String setEmail) {
		setInfo(setName, setId, setGroup, setEmail);
	}
	public Student(Student s){
        name = s.getName();
        id = s.getId();
        group = s.getGroup();
        email = s.getEmail();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public void setInfo(String setName, String setId, String setGroup, String setEmail) {
		name = setName;
		id = setId;
		group = setGroup;
		email = setEmail;
	}
	public void getInfo() {
		System.out.printf("Name: %s\nId: %s\nGroup: %s\nEmail: %s \n", name, id, group, email);
	}
}
