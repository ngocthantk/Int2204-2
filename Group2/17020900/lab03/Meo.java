package minh.dim;

public class Meo {
	private int trongluong;
	private String loaimeo;
	private String mausac;
	public int getTrongLuong() {
		return this.trongluong;
	}
	public void setTrongLuong(int x) {
		this.trongluong = x;
	}
	public String getLoaiMeo() {
		return this.loaimeo;
	}
	public void setLoaiMeo(String loaimeo) {
		this.loaimeo = loaimeo;
	}
	public String getMauSac() {
		return this.mausac;
	}
	public void setMauSac(String mausac) {
		this.mausac = mausac;
	}
	public Meo(int trongluong, String loaimeo,String mausac) {
		this.trongluong = trongluong;
		this.loaimeo = loaimeo;
		this.mausac = mausac;
	}
	public void xuat() {
		System.out.println(this.trongluong + " " + this.loaimeo + " " + this.mausac);
	}
	public static void main(String[] args) {
		Meo M = new Meo(2,"XYZ", "Black");
		M.xuat();

	}

}
