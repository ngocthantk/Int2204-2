package Bai03;

public class SinhVien {
	String ten,lop,truong;
	float diemTB;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getTruong() {
		return truong;
	}
	public void setTruong(String truong) {
		this.truong = truong;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(int diemTB) {
		this.diemTB = diemTB;
	}
	public void getInfo() {
		System.out.println(ten+"\n"+lop+"\n"+truong+"\n"+diemTB);			
	}
	
	public void canBo() {
		System.out.println("Sinh Viên là Phó Bí Thư");
	}
	
	public void theThao() {
		System.out.println("Sinh Viên rất thích thể thao");
	}
	public static void main(String[] args) {
		SinhVien SV = new SinhVien();
		SV.setTen("Phan Văn Tuấn");
		SV.setLop("K62-CC");
		SV.setTruong("UET");
		SV.setDiemTB(10);
		SV.getInfo();
		SV.canBo();
		SV.theThao();
	}
}
