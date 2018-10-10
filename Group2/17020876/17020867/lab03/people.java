package people;

public class people {

	private String name;//tên
	private String skin;//da
	private int age;//tuổi
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public people()
	{
		this.name ="alen";
		this.skin="black";
		this.age=43;
	}
	//bảng tháp tuổi
	public void age()
	{
		if(this.getAge()<=18)
		{
			System.out.println("Kid");
		}
		if(this.getAge()>18&&this.getAge()<60)
		{
			System.out.println("adults");
		}
		if(this.getAge()>60)
		{
			System.out.println("old");
		}
	}
	public static void main(String[] args) {
		people a =new people();
		a.age();

	}

}
