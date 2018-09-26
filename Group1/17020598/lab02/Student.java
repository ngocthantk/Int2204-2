/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author AnhTam
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void getInfo()
    {
        System.out.println(this.getName() + " " + this.getId() + " " + this.getGroup() + " " + this.getEmail());
    }
    public Student(){
        this.name="Student";
        this.id ="000";
        this.group ="K61CA";
        this.email ="uet@vnu.edu.vn";
    }
	
	public Student (String name, String id ,String email)
    {
        this. name = name;
        this.id = id;
        this.email = email;
        this.group ="k62IE2";
    }
	
	public Student(Student s){
   	this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group =s.group;
   }
        
}
