/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class student {
    private String name;
	private String id;
	private String group;
	private String email;
	
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
	
	public void getInfo()
	{
		System.out.println(this.getName() + "    " + this.getId() + "    " + this.getGroup() + "    " + this.getEmail());
	}
        public student()
        {
            this.name="Nguyen Dat Ngoc Anh";
            this.id = "17020574";
            this.group = "K62_CB";
            this.email = "datanh14@gmail.com";
        }
        public student (String name, String id, String email)
        {
            this.name = name;
            this.id = id;
            this.group = "K62_CC";
            this.email = email;
        }
        public student(student s)
        {
            this.name = s.name;
            this.id = s.id;
            this.group = s.group;
            this.email = s.email;
        }

	
   
}
