
public class Student{
	
			
	       	private String name;
		private String id;
		private String group;
		private String email;
	public Student (String name, String id ,String email,String group)
    {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group =group;
    }
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
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
        public void setGroup(String Group){
                this.group =Group;
        }
        public String getGroup(){
            return this.group;
        }
	public void getInfo() {
		System.out.println(this.getName() + " " + this.getId() + " " + this.getGroup() + " " + this.getEmail());
	}
	public Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	public Student(Student s){
   	this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
   }
}
