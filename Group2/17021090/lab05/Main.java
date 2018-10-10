package lab05;

public class Main {
	public static void main(String[] args)
	{
		HoaQua newHoaQua = new HoaQua();
		HoaQua newQuaCam = new HoaQua();
		QuaCam newCamSanh = new CamSanh();
		QuaTao newQuaTao = new QuaTao(true);
		CamCaoPhong newCamCaoPhong = new CamCaoPhong();
		System.out.println(newCamSanh.getTaste());
		
	}
}
