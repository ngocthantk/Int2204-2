/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doituong;

/**
 *
 * @author Dat Anh
 */
public class teacher {
    private String name;//tên
	private int age;//tuổi
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public teacher()
	{
		this.name="A";
		this.age=45;
	}
	//in ra thông báo về giáo viên
	public void teacherInfo()
	{
		System.out.println(this.getName() + "    " + this.getAge());
	}
}
