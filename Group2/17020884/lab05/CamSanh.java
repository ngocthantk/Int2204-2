package c1fruit;

import java.awt.Color;

public class CamSanh extends QuaCam{
		
	private final Color color = Color.GREEN;
	private int totalAmount;
	public CamSanh() {		
		setPrice(13000);
		totalAmount =1;
	}

	public CamSanh(int totalAmount) {
		new QuaCam();
		setPrice(13000);
		this.totalAmount =totalAmount;
	}
	
	public void getInfo() {
		System.out.println("Cam Sanh info:");
		System.out.println("Gia ca:  " + this.getPrice());
		System.out.println("So luong:" + totalAmount);
	}
}
