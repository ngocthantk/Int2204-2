public class Cat {

	private String name;
	private String color;
	private int age;
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
	public Cat()
	{
		this.name="kity";
		this.color="white and pink";
		this.age=3;
	}
	public void sounding()
	{
		System.out.println("Meo meo");
	}

}
