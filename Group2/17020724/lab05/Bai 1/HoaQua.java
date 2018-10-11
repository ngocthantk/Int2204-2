package lab05;

public class HoaQua {
	protected double gia, soluong;
	protected String xuatsu, ngaynhap;
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public double getSoluong() {
		return soluong;
	}
	public void setSoluong(double soluong) {
		this.soluong = soluong;
	}
	public String getXuatsu() {
		return xuatsu;
	}
	public void setXuatsu(String xuatsu) {
		this.xuatsu = xuatsu;
	}
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public HoaQua() {
		this.gia = 120000;
		this.soluong = 20;
		this.xuatsu = "Viet Nam";
		this.ngaynhap = "10.10.2018";	
	}
	public HoaQua(double gia, double soluong, String xuatsu, String ngaynhap) {
		this.gia = gia;
		this.soluong = soluong;
		this.xuatsu = xuatsu;
		this.ngaynhap = ngaynhap;
	}
	public String toString() {
		return "Hoa Qua\nGia: " + getGia() + "\nSo luong " + getSoluong() + "\nXuat su: " + getXuatsu() + "\nNgaynhap: " + getNgaynhap() + "\n";
	}
}
