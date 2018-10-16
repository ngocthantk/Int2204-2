package lab;

public class Cam extends Fruit {
	private String Taste;
	private int price;
	public Cam(String name, String color) {
		super(name, color);
		}
	public Cam() {
		
	}
	public Cam (String name,String color,String Taste,int price)
	{
		super(name, color);
		this.Taste=Taste;
		this.price=price;
	}
	
	public String getTaste() {
		return Taste;
	}
	public void setTaste(String taste) {
		Taste = taste;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	public String getName()
//	{
//		return this.getName();
//	}
	
	public String toString()
	{
		String s;
		s=this.getName()+"     "+this.getColor()+"    "+Taste+"    "+price+"    ";
		return s;
	}

}
