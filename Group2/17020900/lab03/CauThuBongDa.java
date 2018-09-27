package minh.dim;

import java.util.Scanner;

public class CauThuBongDa {
	private int tuoi;
	private String clb;
	public CauThuBongDa(int x,String y) {
		this.tuoi = x;
		this.clb = y;
	}
	public int getTuoi() {
		return this.tuoi;
	}
	public void setTuoi(int x) {
		this.tuoi = x;
	}
	public String getClb() {
		return this.clb;
	}
	public void setClb(String x) {
		this.clb = x;
	}
	public void xet() {
		if(this.tuoi > 23) {
			System.out.println("khong duoc tham du u23");
		} else {
			System.out.println("duoc tham du u23");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Scanner sr = new Scanner(System.in);
		String y = sr.nextLine();
		CauThuBongDa a = new CauThuBongDa(x, y);
		a.xet();
	}

}
