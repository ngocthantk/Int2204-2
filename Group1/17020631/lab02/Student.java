package Studentmanagement;

import java.util.Scanner;

public class Student {
	
private String name,id,group,email;
	public Student() {
		name="student";
		id="000";
		group="INT22041";
		email="uet@vnu.edu.vn";
	}
	public Student(String name,String id,String email) {
		this.name=name;
		this.id=id;
		this.email=email;
		group="INT22041";
	}
	/*public void nhapDuLieu() {
		Scanner sc= new Scanner(System.in);
		System.out.println("moi ban nhap ten: ");
		name= sc.nextLine();
		System.out.println("moi ban nhap ma sv: ");
		id=sc.nextLine();
		System.out.println("moi ban nhap lop sv: ");
		group=sc.nextLine();
		System.out.println("moi ban nhap email sv: ");
		email=sc.nextLine();
	}*/
	public void getInfo() {
		System.out.println("ten sinh vien la: "+ name);
		System.out.println("ma so sinh vien la: "+ id);
		System.out.println("lop of sinh vien la: "+ group);
		System.out.println("email sinh vien la: "+ email);
		System.out.println("");
	}
	
	
	
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
	
	
	
}
