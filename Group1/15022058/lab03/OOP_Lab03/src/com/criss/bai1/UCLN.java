package com.criss.bai1;

import java.util.Scanner;

public class UCLN {
	private static Scanner scanner = new Scanner(System.in);
	private int a, b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public UCLN() {
		super();
	}

	public UCLN(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	//tìm ước chung lớn nhất
	public static int UCLN(int a, int b) {
		if (b == 0) {
			return a;
		}
		return UCLN(b, a % b);
	}

	public static void main(String[] args) {
		System.out.print("Nhập a = ");
		int a = scanner.nextInt();
		System.out.print("Nhập b = ");
		int b = scanner.nextInt();
		System.out.println("UCLN " + a + " và " + b + " là:" + UCLN(a, b));
	}
}
