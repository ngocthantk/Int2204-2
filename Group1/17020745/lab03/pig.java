package task3;
//xây dựng class con lợn
public class pig {

	private String name;//tên
	private String species;//giống
	private int month;//tháng tuổi
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public pig()
	{
		this.name="0003";
		this.month=4;
		this.species="mang";
	}
	//cách lấy thịt
	public void meat()
	{
		if(this.month<6)
		{
			System.out.println("not sold");
		}
		else
		{
			System.out.println("sold");
		}
	}

}
