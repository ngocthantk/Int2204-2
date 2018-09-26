package chap03.oop;

public class Main {
	public static void main(String[] args) {
		Main x = new Main();
		System.out.println(x.UCLN(6,9));
		
		System.out.println(x.f(10));
	}
	public int UCLN(int a,int b) {
		if(a<0) {
			a=-a;
		} else if(b<0) {b=-b;}
		while(a!=b) {
			if(a>b) {
				a-=b;
			} else {
				b-=a;
			}
		}
		return a;
	}
	public int f(int n) {
		if(n==0) {
			return 0;
		} else if(n==1) {
			return 1;
		} else {
			return f(n-1)+f(n-2);
		}
	}
	
}
