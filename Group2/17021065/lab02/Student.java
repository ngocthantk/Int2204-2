public class Student{                                             
	private String name; 
	private String id; 
	private String group; 
	private String email;                                            //5
 	public Student(){                                            
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn";                                //10
	} 
	public Student(String n, String sid, String em){
		name = n;
		id = sid;
		group = "INT22041";                                      //15
		email = em;
	}
	public Student(Student s){
		name = s.getName();
		id = s.getID();                                          //20
		group = s.getGroup();
		email = s.getEmail();
	}
	public void setName(String n) { name = n; }
	public void setID(String n)   { id = n; }                        //25
	public void setGroup(String n){ group = n; }
	public void setEmail(String n){ email = n; }		
		
	public String getName() { return name; }
  	public String getID()   { return id; }                           //30
	public String getGroup(){ return group; }
	public String getEmail(){ return email; }
		
	public void getInfo(){
		System.out.println(this.name);                           //35
		System.out.println(this.id);
		System.out.println(this.group);
		System.out.println(this.email);
		System.out.println(" ");
	}								 //40
}