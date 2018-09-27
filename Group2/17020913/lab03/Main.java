package week_3;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Main strr= new Main();
		Scanner input = new Scanner(System.in);
		//nhap a,b,n
		System.out.println("Nhap a : ");
		int a= input.nextInt();
		System.out.println("Nhap b : ");
		int b =input.nextInt();
		System.out.println("Nhap n : ");
		int n =input.nextInt();	
		System.out.println(strr.timUoc(a,b));
		System.out.println(strr.fiBo(n));
		
		// TODO Auto-generated method stub

	}
// tim uoc
public  int timUoc(int a, int b) {
		a= Math.abs(a);
		b=Math.abs(b);
	if(b>a) {int c=a;a=b;b=c;};
	if(b==0) return a;
	
		return timUoc(b,a%b);
}
//fibo
public int fiBo(int n) {
	int c=0, d=1, fibo=0;
	for(int i=2;i<=n;i++)
	{
		fibo=c+d;
		c=d;
		d=fibo;
	};
	return fibo;
};


}
