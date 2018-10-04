package lab03.tu;

public class Sport {
	private String name;
	private int player;
	
	public Sport (String name, int player)
	{
		this.name = name;
		this.player = player;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPlayer(int player)
	{
		this.player = player;
	}
	public String getName()
	{
		return this.name;
	}
	public int getPlayer()
	{
		return this.player;
	}
	public void KingSport()
	{
		if ( this.player == 11)
		{
			System.out.print("Mon the thao vua");
		}else
		{
			System.out.print("Mon the thao pho bien");
		}
	}
	public static void main(String[] args) {
		Sport tmp = new Sport("FootBall",11);
		tmp.KingSport();

	}

}
