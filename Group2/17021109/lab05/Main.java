package Example1;

public class Main {

	public static void main(String[] args) {
		HoaQua i = new HoaQua();
		i.setTen("Quả Mít");
		i.setXuatSu("Thanh Chương-Nghệ An");
		i.setGia("50k/1kg");
		
		CamCaoPhong caoPhong = new CamCaoPhong();
		caoPhong.setTen("Cam Cao Phong");
		caoPhong.setXuatSu("Việt Nam");
		caoPhong.setNgayNhap("Nhập ngày 8/10/2018");
		caoPhong.setSoLuong(100);
		caoPhong.setGia("100k/1 Quả");
		
		CamSanh sanh = new CamSanh();
		sanh.setTen("Cam Sành");
		sanh.setXuatSu("Vinh City");
		sanh.setGia("1 triệu / 1 quả");
		sanh.setNgayNhap("8/10/2018");
		sanh.setSoLuong(90);
		
		System.out.println(i.Ten+"\n"+i.xuatSu+"\n"+i.Gia);
		System.out.println("--------------------------------------");
		System.out.println(caoPhong.Ten+"\n"+caoPhong.xuatSu+"\n"+caoPhong.Gia+"\n"+caoPhong.ngayNhap);
		System.out.println("--------------------------------------");
		System.out.println(sanh.Ten+"\n"+sanh.xuatSu+"\n"+sanh.Gia+"\n"+sanh.ngayNhap);
	}

}
