package task3;
//Xây dựng class con bò
public class cow {

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
	
	public cow()
	{
		this.name="0001";
		this.age =4;
		this.color="white";
	}
	//cách lấy sữa
	public void mill()
	{
		if(this.getAge()>3)
		{
			System.out.println("get milk");
		}
	}

}
