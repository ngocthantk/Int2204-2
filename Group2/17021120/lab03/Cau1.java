package lab03;

public class Cau1 {
	public static void main(String[] args)
	{
		int a=-15,b=5,n=10;
		Cau1 Check=new Cau1();
		System.out.println(Check.UCLN(a, b));
		Check.Fibonaci(n);
		
	}
	public int UCLN(int a, int b)
	{
		if(a<0) {a=-a;}
		if(b<0) {b=-b;}
		while(a!=b)
		{
		if(a<b)
		{
			b=b-a;
		}
		else
		{
			a=a-b;
		}
		}
		return a;
	}
	public void Fibonaci(int n)
	{
		int a[]=new int[n];
		a[0]=0;
		a[1]=1;
		//a[2]=1;
		System.out.println("f(0)=0\nf(1)=1");
		for(int i=2; i<n; i++)
		{
			a[i]=a[i-1]+a[i-2];
			System.out.println("f("+i+")="+a[i]);
		}
	}
	
}
