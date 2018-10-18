package exercise1;

import org.junit.Test;
//import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

//Lop de test bai 1
public class testHoaQua
{
    public static void main(String[] args)
    {
        //hoaQua hoaqua = new hoaQua();
       // quaCam quacam = new quaCam();
        //quaTao quatao = new quaTao();
        //camCaoPhong camcaophong = new camCaoPhong();
       // camSanh camsanh = new camSanh();
        //System.out.println(quatao.getName());
    	camCaoPhong camcaophong = new camCaoPhong();
    	camcaophong.setGiaBan(100);
    	System.out.println(camcaophong.getName());
        
    }


}
