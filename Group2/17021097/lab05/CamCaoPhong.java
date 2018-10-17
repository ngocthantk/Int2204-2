package tu.phamanh;

public class CamCaoPhong extends QuaCam
{
	private String source;
	public CamCaoPhong()
	{
		this.name = "Cam Cao Phong";
		this.taste = "chua, ngot";
	    this.saleprice = 35.0;
	    this.source = " dac san tinh Hoa Binh";
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String toString() 
	{
		return super.toString() + " source:" + this.source;
	}
}

