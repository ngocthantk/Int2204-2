package tu.phamanh;

public class CamSanh extends QuaCam
{
	private String bark;
	public CamSanh()
	{
		this.name = "Cam Sanh";
		this.taste = "chua, ngot";
	    this.saleprice = 40.0;
	    this.bark = "vo day thuong co mau xanh ";
	}
	public String getBark() {
		return bark;
	}
	public void setBark(String bark) {
		this.bark = bark;
	}
	public String toString() {
		return super.toString() + " Bark:" + this.bark;
	}
}
