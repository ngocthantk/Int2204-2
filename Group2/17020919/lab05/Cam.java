package lab05;

public class Cam extends Fruit {
	private String Taste;
	private int gia;
	public Cam(String name, String color) {
		super(name, color);
		}
	public Cam (String name,String color,String Taste,int gia)
	{
		super(name, color);
		this.Taste=Taste;
		this.gia=gia;
	}
	
	public String getTaste() {
		return Taste;
	}
	public void setTaste(String taste) {
		Taste = taste;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
//	public String getName()
//	{
//		return this.getName();
//	}
	
	public String toString()
	{
		String s;
		s=this.getName()+"     "+this.getColor()+"    "+Taste+"    "+gia+"    ";
		return s;
	}

}
