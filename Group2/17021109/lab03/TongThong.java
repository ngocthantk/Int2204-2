package Bai03;

public class TongThong {
	int tuoi;
	String ten,quocGia,niemKi,Dang;
	
	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}

	public String getNiemKi() {
		return niemKi;
	}

	public void setNiemKi(String niemKi) {
		this.niemKi = niemKi;
	}

	public String getDang() {
		return Dang;
	}

	public void setDang(String dang) {
		Dang = dang;
	}
	
	public void niemKy() {
		System.out.println("Tổng Thống đã hết niệm kì");
	}
	public void chieuCao() {
		System.out.println("1,85 m");
	}
	public void getInfo() {
		System.out.println(ten+"\n"+tuoi+"\n"+quocGia+"\n"+niemKi+"\n"+Dang);
			
	}
	public static void main(String[] args) {
		TongThong TT = new TongThong();
		TT.setTen("Obama");
		TT.setTuoi(57);
		TT.setQuocGia("Hoa Kì");
		TT.setNiemKi("20 tháng 1, 2009 – 20 tháng 1, 2017");
		TT.setDang("Đảng Dân Chủ");
		TT.getInfo();
		TT.niemKy();
		TT.chieuCao();
	}

}
