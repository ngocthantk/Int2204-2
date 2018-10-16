/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class Main {
	public static void main(String[] args)
	{
		CamCaoPhong cam1 = new CamCaoPhong("Cam Cao Phong");
		CamSanh cam2 = new CamSanh("Cam Sanh");
		System.out.println("Cam Cao Phong");
		System.out.println(cam1.getMauSac());
		System.out.println(cam1.getVi());
		System.out.println(cam1.getGiaBan());
		System.out.println(cam1.getNguonGoc());
		System.out.println(cam1.getSoLuong());
		System.out.println();
		System.out.println(cam2.getMauSac());
		System.out.println(cam2.getVi());
		System.out.println(cam2.getGiaBan());
		System.out.println(cam2.getNguonGoc());
		System.out.println(cam2.getSoLuong());
	}
}
