package Bai03;

public class LapTrinhVien {
	int tuoi;
	String ten,ngonNgu,congTy,chuyenNganh;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getNgonNgu() {
		return ngonNgu;
	}
	public void setNgonNgu(String ngonNgu) {
		this.ngonNgu = ngonNgu;
	}
	public String getCongTy() {
		return congTy;
	}
	public void setCongTy(String congTy) {
		this.congTy = congTy;
	}
	public String getChuyenNganh() {
		return chuyenNganh;
	}
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	public void getInfo() {
		System.out.println(ten+"\n"+tuoi+"\n"+chuyenNganh+"\n"+ngonNgu+"\n"+congTy);
			
	}
	
	public void song() {
		System.out.println("Lập trình viên còn sống");
	}
	
	public void sucKhoe() {
		System.out.println("Lập trình viên có sức khỏe tốt");
	}
	public static void main(String[] args) {
		LapTrinhVien LapTrinh = new LapTrinhVien();
		LapTrinh.setTen("Phan Văn Tuấn");
		LapTrinh.setTuoi(19);
		LapTrinh.setChuyenNganh("CNTT");
		LapTrinh.setNgonNgu("Java");
		LapTrinh.setCongTy("UET");
		LapTrinh.getInfo();
		LapTrinh.song();
		LapTrinh.sucKhoe();
	}

}
