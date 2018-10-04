/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author CCNE
 */
public class main {
     public static void main(String[] args) {
        PS ps1 = new PS(2, 3);
        PS ps2 = new PS(2, 3);
        PS tong;
        PS hieu;
        PS tich;
        PS thuong;
        ps1.ToiGianPS();
        ps2.ToiGianPS();
        tong = ps1.tong(ps2);
        tong.ToiGianPS();
        tong.HienThi();
        hieu = ps1.hieu(ps2); 
		hieu.ToiGianPS();
		hieu.HienThi();
        tich = ps1.tich(ps2);
		tich.ToiGianPS;
		tich.HienThi();
        if(ps2.getTS()==0) System.out.println("Phan so khong the thuc hien phep chia.");
        else {thuong = ps1.thuong(ps2); 
        thuong.HienThi();}
    }
}
