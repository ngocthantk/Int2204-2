package lab03;

public class cau1 {
	public int ucln(int a,int b) {
		int x=Math.abs(a);
		int y=Math.abs(b);
		while(x!=y) {
			if(x>y) x-=y;
			else y-=x;
		}
		return x;
	}
	public int fibonaxy(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibonaxy(n-1)+fibonaxy(n-2);
	}
	public static void main(String[] args) {
		cau1 s= new cau1();
		System.out.println(s.ucln(-15, 5));
		System.out.println(s.fibonaxy(6));
	}
}
