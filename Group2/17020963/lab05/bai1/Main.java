package bai1;

public class Main {

	public static void main(String[] args) {
		HoaQua hoaqua = new HoaQua();
		QuaTao quatao = new QuaTao();
		QuaCam quacam = new QuaCam();
		CamCaoPhong camcaophong = new CamCaoPhong();
		CamSanh camsanh = new CamSanh();
		
		quatao.setAmountn("100");
		System.out.println(quatao.getAmount() + "kg");
		
		camcaophong.setFatured("chua");
		System.out.println(camcaophong.getName() + camcaophong.getFeatured());
		
		camsanh.setOrigin("Sieu Thi");
		camsanh.setPrice("10k");
		System.out.println(camsanh.getName() + camsanh.getOrigin() + " gia " + camsanh.getPrice());
		
		
	}
}
