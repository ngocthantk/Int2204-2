package lab;

public class CamSanh extends Cam {
private String nsx;
	

	public CamSanh(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public CamSanh (String name,String color,String Taste,int price,String nsx)
	{
		super(name, color,Taste,price);
		this.nsx=nsx;
	}
	public CamSanh() {
		
	}
	
	public String toString()
	{
		String s;
		s=this.getName()+"     "+this.getColor()+"    "+this.getTaste()+"    "+this.getPrice()+"    "+nsx;
		return s;
	}


}
