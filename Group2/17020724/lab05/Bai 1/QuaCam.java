package lab05;

public class QuaCam extends HoaQua {
	protected String mausac, huongvi;

	public String getMausac() {
		return mausac;
	}

	public void setMausac(String mausac) {
		this.mausac = mausac;
	}

	public String getHuongvi() {
		return huongvi;
	}

	public void setHuongvi(String huongvi) {
		this.huongvi = huongvi;
	}

	public QuaCam(String mausac, String huongvi) {
		super();
		this.mausac = mausac;
		this.huongvi = huongvi;
	}
	public QuaCam() {
		super();
		this.huongvi = "Ngot";
		this.mausac = "Cam";
	}
	public String toString() {
		return "Qua Cam\nGia: " + getGia() + "\nSo luong: " + getSoluong() + "\nXuat su: " + getXuatsu() + "\nNgaynhap: " + getNgaynhap() + "\nMau sac: " + mausac + "\nHuong vi: " + huongvi +"\n";
	}
}
