package lap05_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HoaQua quaTao= new QuaTao();
		HoaQua quaCam= new QuaCam();
		HoaQua camCaoPhong= new CamCaoPhong();
		HoaQua camSanh= new CamSanh();
		quaTao.setGiaBan(25);
		System.out.println(quaTao.getGiaBan()+"----"+camCaoPhong.getGiaBan());
		
	}

}
