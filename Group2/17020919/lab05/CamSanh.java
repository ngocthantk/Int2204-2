package lab05;

public class CamSanh extends Cam {
private String nsx;
	

	public CamSanh(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public CamSanh (String name,String color,String Taste,int gia,String nsx)
	{
		super(name, color,Taste,gia);
		this.nsx=nsx;
	}
	
	public String toString()
	{
		String s;
		s=this.getName()+"     "+this.getColor()+"    "+this.getTaste()+"    "+this.getGia()+"    "+nsx;
		return s;
	}


}
