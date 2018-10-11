package lab05;

public class QuaTao extends HoaQua {
	private String loaiTao;

	public String getLoaiTao() {
		return loaiTao;
	}

	public void setLoaiTao(String loaiTao) {
		this.loaiTao = loaiTao;
	}
	
	public QuaTao() {
		super();
		this.gia = 15000;
		this.loaiTao = "Tao Xanh";
	}

	public String toString() {
		return "Qua Tao\nLoai Tao: "+ getLoaiTao()+  "\nGia: " + getGia() + "\nSo luong: " + getSoluong() + "\nXuat su: " + getXuatsu() + "\nNgaynhap: " + getNgaynhap() + "\n";
	}
	
}
