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
public class house {
    private String name;//tên
	private String color;//mau
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
	
	public house()
	{
		this.name="vinhome";
		this.color = "white";
	}
	//in ra thông tin ngôi nhà
	public void houseInfo()
	{
		System.out.println(this.getName() + "    " + this.getColor());
	}
}
