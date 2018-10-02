public class Teacher{
	
			
	       	private String name;
		private String subject;
		private String email;
	public Teacher (String name, String subject,String email)
    {
        this.name = name;
        this.subject = subject;
        this.email = email;
        
    }
	public String getName() {
                return this.name;
		}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
       
