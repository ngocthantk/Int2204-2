package phamanhtu.v;
import java.util.Scanner;

public class BaiTap 
{
	public static int GTLN(int a, int b)
	{	
		if (a>=b)return a;
		return b;
	}
	public static int GTNN(int a[])
	{
		int k = a.length;
		if(k == 0)
			{return 0;}
		else{
		int min = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (min >= a[i])
			{
				min = a[i];
			}
		}
		
		return min;
		}}
	public static String BMI(double we, double he)
	{
		double result = we / (he*he);

		if(result < 18.5)
		{
			return "Thiếu cân";
		}
		else if(result < 23)
		{
			return "Bình thường";
		}
		else if(result < 24.99)
		{
			return "Thừa cân";
		}
		else
		{
			return "Béo phì";
		}
	}
	public static void main(String[] args) 
	{	
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
	
		int a[] = new int [n];
		for (int i = 0; i < n; i++) 
		{
			 a[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.print(GTNN(a));
	}

}




