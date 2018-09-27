package minh.dim;

import java.util.Scanner;

public class Class {
	private int soban;
	private int soghe;
	public int getSoBan() {
		return this.soban;
	}
	public int getSoGhe() {
		return this.soghe;
	}
	public void setSoBan(int x) {
		this.soban = x;
	}
	public void setSoGhe(int y) {
		this.soghe = y;
	}
	public void Test() {
		if(this.soban >= 20 && this.soghe >= 40) {
			System.out.println("dat yeu cau lop hoc");
		} else {
			System.out.println("khong dat yeu cau lop hoc");
		}
	}
	public static void main(String[] args) {
		Class lop = new Class();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		lop.setSoBan(x);
		lop.setSoGhe(y);
		lop.Test();
	}

}
