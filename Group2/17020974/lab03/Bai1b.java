import java.util.Scanner;
public class Bai1b{
	//ham tim so fibo thu n
	public int fibo(int n){
		if(n==0||n==1)
			return 1;
		else return fibo(n-1)+fibo(n-2);
	}
	//ham main
	public static void main(String[] args){
		Bai1b a=new Bai1b();
		Scanner nhap=new Scanner(System.in);
		int n;
		n=nhap.nextInt();
		System.out.print(a.fibo(n));	
	}
}