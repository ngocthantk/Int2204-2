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
public class Pig {
    private String name;//tên
	private String color;//màu
	private int age;//tuổi
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Pig()
	{
		this.name="lol";
		this.color="white";
		this.age = 6;
	}
	//in ra tiếng mèo kêu
	public void pigInfo()
	{
		System.out.println(this.name + "  " + this.color + "  " + this.age + "  ");
	}
    
}
