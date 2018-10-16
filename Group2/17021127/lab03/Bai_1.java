package tuan2;

public class Bai_1 {
	public static void main(String[] args) {
		Bai_1 g = new Bai_1();
		int a,b;
		a = 6;
		b = 9;
		int n = 10;
		System.out.println(g.ucln(a,b));
		System.out.print(g.fibo(n));
	}
	
	
	public int ucln(int a,int b) {
		if (b == 0)return a;
		else return ucln(b,a%b);
	}
	public int fibo(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (n > 1) return (fibo(n-1)+fibo(n-2));
		return 0;
	}
	
}
