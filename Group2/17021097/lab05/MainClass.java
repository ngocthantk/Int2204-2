package tu.phamanh;

public class MainClass 
{
	

	public static void main(String[] args) 
	{
		//QuaCam
		QuaCam quacam = new QuaCam();
		String inQuaCam = quacam.toString();
        System.out.println(inQuaCam);

        //QuaTao
        QuaTao quatao = new QuaTao();
        String inQuaTao = quatao.toString();
		System.out.println(inQuaTao);
		 //CamSanh
        CamSanh camsanh = new CamSanh();
        String inCamSanh = camsanh.toString();
		System.out.println(inCamSanh);
		 //CamCaoPhong
        CamCaoPhong camcaophong = new CamCaoPhong();
        String inCamCaoPhong = camcaophong.toString();
		System.out.println(inCamCaoPhong);
	}

}


