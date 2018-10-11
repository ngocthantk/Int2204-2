package cau1;

public class Main {

	public static void main(String[] args) {
		HoaQua quaCam= new QuaCam();
		CamCaoPhong camCaoPhong= new CamCaoPhong();
		HoaQua camSanh= new CamSanh();
		camCaoPhong.setGiaBan(90);
		System.out.println(camCaoPhong.getGiaBan()+"    "+camCaoPhong.getMuiVi());
		
	}

}
