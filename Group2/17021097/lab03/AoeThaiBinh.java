package lab03.tu;

public class AoeThaiBinh {
	private String name;
	private int age;
	private String title;
	
	public AoeThaiBinh(String name, int age, String title)
	{
		this.name  = name;
		this.age = age;
		this.title = title; 
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge() 
	{
		return this.age;
	}
	public String getTitle()
	{
		return this.title;
	}
	public void Titles()
	{
		if (this.title == "Vo dich solo Aoe Viet Trung")
		{
			System.out.print("Game thu xuat sac");
		}
		else
		{
			System.out.print("Co trien vong");
		}
	}
	public static void main(String[] args)
	{
		AoeThaiBinh Game = new AoeThaiBinh ("Hong Anh", 23, "Vo dich solo Aoe Viet Trung");
				Game.Titles();

	}

}
