package lab;

public class CamCaoPhong extends Cam{
	private String nsx;
	

	public CamCaoPhong(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public CamCaoPhong (String name,String color,String Taste,int price,String nsx)
	{
		super(name, color,Taste,price);
		this.nsx=nsx;
	}
	public CamCaoPhong () {
		
	}
	public String toString()
	{
		String s;
		s=this.getName()+"     "+this.getColor()+"    "+this.getTaste()+"    "+this.getPrice()+"    "+nsx;
		return s;
	}

}
