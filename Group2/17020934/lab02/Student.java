public class Student{                                             
	private String name; 
	private String id; 
	private String group; 
	private String email;     
    public Student(){	
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn"; 
	}	
	public Student(String n, String sid, String em){
		name = n;
		id = sid;
		group = "INT22041";                                      
		email = em;
	}
	public Student(Student s){
		name = s.getName();
		id = s.getID();                                         
		group = s.getGroup();
		email = s.getEmail();
	}
	
	public void setName(String str) { name = str; }
	public void setID(String str)   { id = str; }                       
	public void setGroup(String str){ group = str; }
	public void setEmail(String str){ email = str; }		
		
	public String getName() 
	    { return name; }
  	public String getID()  
	    { return id; }                           
	public String getGroup()
	    { return group; }
	public String getEmail()
	    { return email; }
		
	public void getInfo(){
		System.out.println(this.name);                          
		System.out.println(this.id);
		System.out.println(this.group);
		System.out.println(this.email);
		System.out.println(" ");
	}								
}

	