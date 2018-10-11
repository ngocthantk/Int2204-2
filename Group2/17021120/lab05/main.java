package lab05;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuaTao quaTao= new QuaTao();
		QuaCam quaCam= new QuaCam();
		CamCaoPhong camCaoPhong= new CamCaoPhong();
		CamSanh camSanh= new CamSanh();
		quaTao.setGiaBan(25);
		System.out.println(quaTao.getGiaBan()+"----"+camCaoPhong.getGiaBan());
		
	}

}
