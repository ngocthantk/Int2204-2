package lab05;

public class Tao extends Fruit {
	private String Taste;
	private int gia;
	private String nsx;
	

	public Tao(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public Tao (String name,String color,String Taste,int gia,String nsx)
	{
		super(name, color);
		this.Taste=Taste;
		this.gia=gia;
		this.nsx=nsx;
	}
	
	public String toString()
	{
		String s;
		s=this.getName()+"     "+this.getColor()+"    "+Taste+"    "+gia+"    "+nsx;
		return s;
	}
	

}
