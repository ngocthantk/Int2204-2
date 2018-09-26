package Bai02;

import java.util.Scanner;

class UCLN_Fibonaxi {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        System.out.print("Nhập số nguyên a = ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b = ");
        int b = sc.nextInt();
        System.out.print("Nhập số nguyên n = ");
        int n = sc.nextInt();
        
        UCLN_Fibonaxi check = new UCLN_Fibonaxi();
        check.UCLN(a, b);
        
        System.out.println("Dãy Fibonaxi với n ="+n+" là: ");
        check.Fibonaxi(n);
    }
	public void UCLN(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while(a!=b) {
			if(a>b)	a = a-b;
			else b = b-a;
		}
		System.out.println(a);
	}
	
	public void Fibonaxi(int n) {
		int n1 = 0, n2 = 1, n3;
		if(n == 0)	System.out.println("0");
		if(n == 1)	System.out.println("1");
		System.out.print(n1+" "+n2+" ");
		for (int i = 0; i < n-1; i++ ) {
			n3 = n2+n1;
			System.out.print(n3+ " ");
			n1 = n2;
			n2 = n3;
		}
	}
}

     




