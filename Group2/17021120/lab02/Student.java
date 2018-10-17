package NguyenCongNgocTuong;

public class Student {
	private String name, id, group, email;

	public Student() {
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn";
	}

	public Student(String n, String sid, String em) {
		name = n;
		id = sid;
		email = em;
		group = "INT22041";
	}

	public Student(Student s) {
		name = s.getName();
		id = s.getId();
		email = s.getEmail();
		group = s.getGroup();
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public String getId() {
		return id;
	}

	public void setId(String s) {
		id = s;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String s) {
		group = s;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String s) {
		email = s;
	}

	public String getInfo() {
		return '\n' + name + '\n' + id + '\n' + group + '\n' + email;
	}
}