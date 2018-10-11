package tu.phamanh2;

public class Square extends Rectangle
{

	public void setSize(double size)
	{
		width = size;
		length = size;
	}
	public Square() 
	{
		super();
	}

	public Square(double size, String color, boolean filled)
	{
		super(size, size, color, filled);
		
	}
	
	public void setWidth(double size)
	{
		super.setWidth(size);
		super.setLength(size);
	}
	public void setLength(double size)
	{
		super.setLength(size);
	}
}
