package lab05;

public class CamSanh extends QuaCam {
	public CamSanh() {
		super();
		this.mausac = "xanh";
	}
	public String toString() {
		return "Cam Sanh\nGia: " + getGia() + "\nSo luong: " + getSoluong() + "\nXuat su: " + getXuatsu() + "\nNgaynhap: " + getNgaynhap() + "\nMau sac: " + mausac + "\nHuong vi: " + huongvi +"\n";
	}
}
