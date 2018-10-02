package obj;

public class Teacher {
	private String name, classname;
	private int age;
	private boolean is_teaching;
	
	public Teacher(String name, String classname, int age)
	{
		this.name=name;
		this.classname= classname;
		this.age=age;
		is_teaching=false;
	}
	
	public void rename(String name) {
		this.name=name;
	}
	public void setClass(String classname) {
		this.classname= classname;
	}
	public void setAge (int age) {
		this.age=age;
	}
	public void teaching() {
		is_teaching=true;
	}
	public void finish() {
		is_teaching=false;
	}
	public boolean isTeaching() {
		return is_teaching;
	}
	public void getInfo () {
		System.out.println("Name  : " + name);
		System.out.println("Age   : " + age);
		System.out.println("Class : " + classname);
	}
	
}
