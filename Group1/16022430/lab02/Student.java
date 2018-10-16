package studentmanagement;
class Student{
	private String id; 
	private String name,group,email;
	public Student(){
		this.name= "Student";
		this.id= "000";
		this.group= "INT22041";
		this.email= "uet@vnu.edu.vn";
		}
	public Student(String n,String sid,String em){
		this.name= n;
		this.id= sid;
		this.email=em;
		this.group="INT22041";
		}
	public Student(Student s){
		this.name= s.name;
		this.id=s.id;
		this.group=s.group;
		this.email=s.email;
		}
	public void setName(String name){
        this.name = name;
		}
    public void setGroup(String group) {
		this.group = group;
		}
	public void setId( String id){
		this.id = id;
		}
	public void setEmail( String email){
		this.email = email;
		}
	public String getGroup(){
		return group;
		}
	public String getName(){
		return name;
		}
	public String getId(){
		return id;
		}
	public String getEmail(){
		return email;
		}
	public void getInfo(){
		System.out.println("Ho Ten: " +getName());
		System.out.println("Lớp: " +getGroup());
        System.out.println("id: " +getId());
		System.out.println("Email: " +getEmail());
		}
	}
		
	
	