package minh.dim;

public class Teacher {
	private int age;
	private String name;
	private String address;
	public int getAge() {
		return this.age;
	}
	public void setAge(int x) {
		this.age = x;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Teacher(int age, String name,String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public void xuat() {
		System.out.println(this.age + " " + this.name + " " + this.address);
	}
	public static void main(String[] args) {
		Teacher teacher = new Teacher(30, "ABC", "XYZ");
		teacher.xuat();
	}

}
