package lab05;

public class CamCaoPhong extends QuaCam {
	public CamCaoPhong() {
		super();
		this.gia = 50000;
		this.xuatsu = "Cao Phong";
	}
	public String toString() {
		return "Cam Cao Phong\nGia: " + getGia() + "\nSo luong: " + getSoluong() + "\nXuat su: " + getXuatsu() + "\nNgaynhap: " + getNgaynhap() + "\nMau sac: " + mausac + "\nHuong vi: " + huongvi +"\n";
	}
}
