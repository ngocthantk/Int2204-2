package lab03.tu;

public class Pokemon {
	private String name;
	private String properties;
	private int level;
	
	public Pokemon(String name, String properties, int level)
	{
		this.name = name;
		this.properties = properties;
		this.level = level;	
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setProperties(String properties)
	{
		this.properties = properties;
	}
	public void setLevel(int level)
	{
		this.level = level;
	}
	public String getName()
	{
		return this.name;
	}
	public String getProperties()
	{
		return this.properties;
	}
	public int getLevel()
	{
		return this.level;
	}
	public void RarePokemon()
	{
		if (this.level >= 50)
		{
			System.out.print("RarePokemon");
		}else 
		{
			System.out.print("Popular Pokemon");
		}
	}
	public static void main(String[] args) 
	{
		Pokemon Pikachu = new Pokemon("Pikachu", "Electricity", 99);
		Pikachu.RarePokemon();
	}

}
