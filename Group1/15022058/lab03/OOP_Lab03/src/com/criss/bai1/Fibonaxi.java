package com.criss.bai1;

import java.util.Scanner;

public class Fibonaxi {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = scanner.nextInt();
		int fn = 1;
		int f0 = 1;
		int f1 = 1;
		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				fn = f0 + f1;
				f0 = f1;
				f1 = fn;
			}
		}
		System.out.println("Số thứ " + n + " là: " + fn);
	}
	public void timSoFibonaxiN() {
		
	}

}
