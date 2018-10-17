package lab05;

public class main {
	public static void main(String[] arg) {
		
		CamCaoPhong camcaophong = new CamCaoPhong();
		camcaophong.setLoai("cam Cao Phong");
		Hoaqua thongtin = new Hoaqua();
		thongtin.setHoaqua(30000, "viet nam", "30/07", "1000 qua");
		camcaophong.setCam(thongtin);
	
		CamSanh camsanh = new CamSanh();
		camsanh.setLoai("cam Sanh");
		Hoaqua thongtin1 = new Hoaqua();
		thongtin1.setHoaqua(30000, "trung quoc", "12/12", "100000 qua");
		camsanh.setCam(thongtin);
		
		System.out.println(
				camcaophong.getLoai() 
				+ " thong tin: " +camcaophong.getCam().getGia() 
				+ " dong nhap ngay " + camcaophong.getCam().getNgaynhap()
			    + " voi so luong " + camcaophong.getCam().getSoluong() 
			    + " o " + camcaophong.getCam().getXuatxu());

	}
}
