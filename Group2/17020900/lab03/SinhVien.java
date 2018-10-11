package minh.dim;

public class SinhVien {
	private String ten,mssv;
	private double diem;
	public SinhVien(String ten, String mssv,double diem) {
		this.ten = ten;
		this.mssv = mssv;
		this.diem = diem;
	}
	public String getTen() {
		return this.ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMssv() {
		return this.mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public double getDiem() {
		return this.diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public void xettotnghiep() {
		if(this.diem >= 5.0) {
			System.out.println("được xét tốt nghiệp");
		} else {
			System.out.println("không đủ điều kiện xét tốt nghiệp");
		}
	}
	public static void main(String[] args) {
		SinhVien sv = new SinhVien("minh","17020900",8.0);
		sv.xettotnghiep();
	}

}
