package minh.dim;

import java.util.Scanner;

public class XeMay {
	private int dongco;
	private String tenxe;
	public int getDongCo() {
		return this.dongco;
	}
	public void setDongCo(int x) {
		this.dongco = x;
	}
	public String getTenXe() {
		return this.tenxe;
	}
	public void setTenXe(String x) {
		this.tenxe = x;
	}
	public void Test(int tuoi) {
		if(this.dongco > 50 && tuoi < 18) {
			System.out.println("khong duoc di xe nay");
		} else {
			System.out.println("duoc di xe nay");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		XeMay x = new XeMay();
		int a = sc.nextInt();
		x.setDongCo(a);
		int tuoi = sc.nextInt();
		x.Test(tuoi);
	}

}
