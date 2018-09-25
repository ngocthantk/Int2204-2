class Student{
	private	String name;
	private String id;
	private	String group;
	private	String email;

	Student(){
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn";
	}
	Student(String n , String sid , String se){
		name = n ; 
		id = sid;
		group = "INT22041";
		email = se;
	}
	Student(Student s){
		name = s.name;
		id = s.id;
		group = s.group;
		email = s.email;
	}

	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public String getGroup(){
		return group;
	}
	public String getEmail(){
		return email;
	}

	public void setName(String n){
		name = n;	
	}
	public void setId(String n){
		id = n;
	}
	public void setGroup(String n){
		group = n;
	}
	public void setEmail(String n){
		email = n;
	}

	public String getInfo(){
		return name + " " + id + " " + group + " " + email ;
	}
}