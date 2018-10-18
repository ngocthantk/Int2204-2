package Bai03;

public class ConMeo {
	int tuoi;
	String mauLong,Loai,gioiTinh;

public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getMauLong() {
		return mauLong;
	}

	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}

	public String getLoai() {
		return Loai;
	}

	public void setLoai(String loai) {
		Loai = loai;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public void HoatDong() {
		System.out.println("Bắt Chuột");
	}
	
	public void tonTai() {
		System.out.println("Đã Tuyệt chủng");
	}
	
	public void getInfo() {
		System.out.println(mauLong+"\n"+Loai+"\n"+gioiTinh+"\n"+tuoi);
			
	}

public static void main(String[] args) {
	ConMeo Meo= new ConMeo();
	Meo.setGioiTinh("Cái");
	Meo.setLoai("Châu Á");
	Meo.setMauLong("Nâu");
	Meo.setTuoi(6);
	Meo.getInfo();
	Meo.HoatDong();
	Meo.tonTai();
	}
}