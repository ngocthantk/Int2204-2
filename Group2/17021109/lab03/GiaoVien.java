package Bai03;

public class GiaoVien {
	int tuoi;
	String Ten,monhoc,truong;
	
	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getMonhoc() {
		return monhoc;
	}

	public void setMonhoc(String monhoc) {
		this.monhoc = monhoc;
	}

	public String getTruong() {
		return truong;
	}

	public void setTruong(String truong) {
		this.truong = truong;
	}
	public void getInfo() {
		System.out.println(Ten+"\n"+monhoc+"\n"+truong+"\n"+tuoi);
			
	}
	
	public void veHuu(int tuoi) {
		
		if(tuoi>60)		System.out.println("Đã về hưu");
		else 			System.out.println("Chưa về hưu");
	}
	
	public void soThich() {
		System.out.println("Thích bóng đá");
	}

	public static void main(String[] args) {
		GiaoVien GV1 = new GiaoVien();
		GV1.setTen("Ho Va Ten");
		GV1.setMonhoc("OOP");
		GV1.setTruong("UET");
		GV1.setTuoi(60);
		GV1.getInfo();
		GV1.veHuu(GV1.tuoi);
		GV1.soThich();
	}
}
