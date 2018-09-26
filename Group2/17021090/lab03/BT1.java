
public class BT1 {
	//Function return GCD of a and b
	public int GCD(int a, int b)
	{
		if (a % b == 0)
			return b;
		else
			return GCD(b,a%b);
	}
	
	//Recursive function to return n-th number of Fibonaxi
	public int Fibo(int n)
	{
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return Fibo(n-1) + Fibo(n-2);
	}
	
	public static void main(String[] args)
	{
		BT1 bt = new BT1();
		System.out.println(bt.GCD(24,10));
		System.out.println(bt.Fibo(20));
	}
	
}
