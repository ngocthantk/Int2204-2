package tree;
public class tree{

	private String name;//tên
	private String species;//loài
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
	public tree()
	{
		this.name="fj";
		this.species="dsd";
		this.month=9;
	}
	//cách lấy gỗ
	public void wood()
	{
		if(this.month>35)
		{
			System.out.println("get wood");
		}
		else
		{
			System.out.println("don't get");
		}
	}

	public static void main(String[] args) {
		tree a = new tree();
		a.wood();

	}

}

