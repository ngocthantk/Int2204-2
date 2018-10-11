package lab05;

public class CamCaoPhong extends Cam{
	private String nsx;
	

	public CamCaoPhong(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public CamCaoPhong (String name,String color,String Taste,int gia,String nsx)
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
