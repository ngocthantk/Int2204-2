package javatest;

public class UCLNandFibonaci {
	public int fibonaci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fibonaci(n-1)+fibonaci(n-2);
	}
	public static void main(String[] args) {
		int a , b ;
		a =-15 ; b =5 ;
		while (b!=0) {
			int x = a%b ;
			a=b;
			b=x;
		}
		UCLNandFibonaci c=new UCLNandFibonaci();
		System.out.println(c.fibonaci(10));
		System.out.println(a);
	}
}
