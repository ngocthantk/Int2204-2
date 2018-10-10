package oop;

public class MyProcess {
	
	public int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
	
	public int fibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		MyProcess cal = new MyProcess();
		System.out.println(cal.gcd(-15, 5));
		System.out.println(cal.fibo(6));
	}
}
