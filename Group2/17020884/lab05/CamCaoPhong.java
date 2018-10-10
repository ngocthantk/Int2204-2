package c1fruit;

import java.awt.Color;

public class CamCaoPhong extends QuaCam{
	
	private final Color color = Color.ORANGE;
	private final String origin = "Cao Phong";
	private int totalAmount;
	
	public CamCaoPhong() {
		setPrice(10000);
		totalAmount=1;
	}
	
	public CamCaoPhong(int totalAmount) {
		new QuaCam();
		setPrice(10000);
		this.totalAmount=totalAmount;
	}
	
	public void getInfo () {
		System.out.println("Cam Cao Phong info:");
		System.out.println("Xuat xu: " + origin);
		System.out.println("Gia ca:  " + this.getPrice());
		System.out.println("So luong:" + totalAmount);
	}
}