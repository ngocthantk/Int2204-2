/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab02;

/**
 *
 * author CCNE
 */
public class Student{
	// Name of student
	private String name;
	private String id;
	private String group;
	private String email;
	//
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
	//
	public void setName(String name_){
		this.name = name_;
	}
	public void setId(String id_){
		this.id = id_;
	}
	public void setGroup(String group_){
		this.group = group_;
	}
	public void setMail(String email_){
		this.email = email_;
	}
	//get info
	public void getInfo(){
		System.out.print("Name: ");
                System.out.println(name);
		System.out.print("Id: ");
                System.out.println(id);
		System.out.print("Group: ");
                System.out.println(group);
		System.out.print("Mail: ");
                System.out.println(email);
	}
	// Init
	Student(){
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}
	Student(String n, String sid, String em){
		this.name = n;
		this.id = sid;
		this.group = "INT22041";
		this.email = em;		
	}	
	Student(Student s){
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}
}
