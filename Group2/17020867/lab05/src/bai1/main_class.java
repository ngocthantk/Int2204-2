package bai1;

//Lop de test bai 1
public class main_class
{
    public static void main(String[] args)
    {
        hoa_qua hoaqua = new hoa_qua();
        qua_cam quacam = new qua_cam();
        qua_tao quatao = new qua_tao();
        cam_cao_phong camcaophong = new cam_cao_phong();
        cam_sanh camsanh = new cam_sanh();
        System.out.println(quatao.getName());
    	camcaophong.setGiaBan(100);
    	System.out.println(camcaophong.getName());
        
    }


}

