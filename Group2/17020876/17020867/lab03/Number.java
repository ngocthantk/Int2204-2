package Number;
import java.util.Scanner;
public class Number {
	public int ucln(int number1, int number2){
		if ( number1<0 ) number1=number1*(-1);
		if ( number2<0 ) number2=number2*(-1);
		while (number1 != number2){
			if (number1 > number2) number1 = number1 - number2;
			else number2 = number2 - number1;
		}
		return number1;
	}
	public int fibo(int n)
	{
		if (n<0) return 0;
		else
		if (n==0) return n;
		else 
		if (n==1) return n;
		else
			return fibo(n-1)+fibo(n-2);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Number so = new Number();
		int a; a = sc.nextInt();
		int b; b = sc.nextInt();
		System.out.println(so.ucln(a,b));
		int n; n = sc.nextInt();
		System.out.println(so.fibo(n));
		sc.close();
	}
		
	
}
