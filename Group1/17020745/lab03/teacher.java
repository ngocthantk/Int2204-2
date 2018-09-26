package task3;
//Xây dựng class giáo viên
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
	public void getInfo()
	{
		System.out.println(this.getName() + "    " + this.getAge());
	}
	

}
