package lab02;
class Student{
	private String name;
	private String ID;
	private String group;
	private String email;
	
	// Constructor
public Student(){
	name	 = "student";
	ID 	 = "000";
	group 	 = "INT22041";
	email 	 = "uet@vnu.edu.vn";
}
public Student(String n, String sid, String em){
	name 	= n;
	ID 	= sid;
	group 	= "INT22042";
	email 	= em;
}
public Student(Student s){
	name 	= s.getName();
	ID 	= s.getID();
	group 	= s.getGroup();
	email 	= s.getEmail();
	}
	// getter, setter
public String getName(){
	return name;
}
public void setName(String n){
	name = n;
}
public String getID(){
	return ID;
}
public void setID(String n){
	ID = n;
}
public String getGroup(){
	return group;
}
public void setGroup(String n){
	group = n;
}
public String getEmail(){
	return email;
}
public void setEmail(String n){
	email = n;
}
public String getInfor(){
	return ("Name: " + name + "\nID: " + ID + "\nGroup: " + group + "\nEmail: " + email + "\n\n");
}
};
