package task3;
//xây dựng class con mèo
public class cat {

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
	public cat()
	{
		this.name="kity";
		this.color="black";
		this.age=3;
	}
	//in ra tiếng mèo kêu
	public void sounding()
	{
		System.out.println("Meo meo");
	}

}
