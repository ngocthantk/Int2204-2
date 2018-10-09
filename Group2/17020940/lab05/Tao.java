package lab;

public class Tao extends Fruit {
	private String Taste;
	private int price;
	private String nsx;
	

	public Tao(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	
	public Tao (String name,String color,String Taste,int price,String nsx)
	{
		super(name, color);
		this.Taste=Taste;
		this.price=price;
		this.nsx=nsx;
	}
	public Tao() {
		
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

	public String getNsx() {
		return nsx;
	}

	public void setNsx(String nsx) {
		this.nsx = nsx;
	}

	public String toString()
	{
		String s;
		s=this.getName()+"     "+this.getColor()+"    "+Taste+"    "+price+"    "+nsx;
		return s;
	}
	

}
