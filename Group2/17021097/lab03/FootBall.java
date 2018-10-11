package lab03.tu;

public class FootBall {
	private String name;
	private int age ;
	private String clb;
	private int goal;
	public FootBall(String name, int age, String clb,int goal)
	{
		this.name = name;
		this.age = age;
		this.clb = clb;
		this.goal = goal;
		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setClb(String clb)
	{
		this.clb = clb;
	}
	public void setGoal(int goal)
	{
		this.goal = goal;
	}
	public String getName()
	{
		return this.name;
	}
	public String getClb()
	{
		return this.clb;
	}
	public int getAge()
	{
		return this.age;
	}
	public int getGoal()
	{
		return this.goal;
	}
	public void KingPhaLuoi()
	{
		if (this.goal >= 30)
		{
			System.out.print("Vua pha luoi Ngoai Hang Anh");
		}
		else
		{
			System.out.print("Cau thu tre xuat sac nhat");
		}
	}
	public static void main(String[] args) 
	{
		FootBall player = new FootBall("Pual Pogba",25,"Manchester United",30);
		player.KingPhaLuoi();
	}

}
