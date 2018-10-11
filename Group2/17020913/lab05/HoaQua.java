// Hoa Qu , Qu Cam, Qu Táo, Cam Cao Phong, Cam Sành
//gia bán/cân, ngu n g c xu t x , ngày nh p, s l ng
 public class HoaQua {
	
	public int Giatien;
	public String Nguongoc ;
	public int Soluong ;
	public String Mausac ;
	
	
//	public void HoaQua1(int Giatien,String Nguongoc , int Soluong ,String Mausac ) {
//		this.Giatien = Giatien;
//		this.Nguongoc = Nguongoc;
//		this.Soluong = Soluong;
//		this.Mausac = Mausac;
//		
//	}
	
	 void ShowInfo() {
		 System.out.println("\t\t\t Gia tien:  " + Giatien );
		 System.out.println("\t\t\t Nguongoc:  " + Nguongoc );
		 System.out.println("\t\t\t  Soluong:  " + Soluong );
		 System.out.println("\t\t\t Mausac:  " + Mausac );
		 
	 }
	 
	 public int getGiatien() {
		return Giatien;
	}

	public void setGiatien(int giatien) {
		Giatien = giatien;
	}

	public String getNguongoc() {
		return Nguongoc;
	}

	public void setNguongoc(String nguongoc) {
		Nguongoc = nguongoc;
	}

	public int getSoluong() {
		return Soluong;
	}

	public void setSoluong(int soluong) {
		Soluong = soluong;
	}

	public String getMausac() {
		return Mausac;
	}

	public void setMausac(String mausac) {
		Mausac = mausac;
	}

//	public static void main(String[] args) {
//		HoaQua hq1 = new HoaQua();
//		HoaQua hq2 = new HoaQua();
//		hq1.HoaQua1(1, "Nguongoc", 1, "Mausac");
//		hq2.HoaQua1(1, "Nguongoc", 1, "Mausac");
//		hq1.ShowInfo();
//		hq2.ShowInfo();
//	}
}
