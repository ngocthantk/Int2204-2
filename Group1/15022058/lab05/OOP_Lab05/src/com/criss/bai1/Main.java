package com.criss.bai1;

public class Main {

	public static void main(String[] args) {

		QuaTao qua1 = new QuaTao();
	    qua1.setGiaTien(10000);
	    qua1.setMauSac("Green");
	    System.out.println(qua1.getGiaTien());
	    System.out.println(qua1.getMauSac());

	    CamSanh qua2 = new CamSanh();
	    qua2.setGiaTien(5000);
	    qua2.setHinhDangVo("sần sùi");
	    System.out.println(qua2.getGiaTien());
	    System.out.println(qua2.getHinhDangVo());
	
	    CamCaoPhong qua3 = new CamCaoPhong();
	    qua3.setNguonGoc("Hòa Bình");;
	    System.out.println(qua3.getMauSac());
	    System.out.println(qua3.getNguonGoc());
	    
	
	    HoaQua qua4 = new HoaQua();
	    qua4.setNguonGoc("Việt Nam");
	    System.out.println(qua4.getNguonGoc());
	
	    QuaCam qua5 =new QuaCam();
	    qua5.setMauSac("Yellow");
	    System.out.println(qua5.getMauSac());


	}

}
