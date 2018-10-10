package baitap;


public class FI {
    	public static void main(String[] args)
	{
		int n=10;
		int[] a =new int[n];
                FI f=new FI();
                f.FI(a, n);

	}
        
        public void FI(int a[],int n)
        {
            a[0]=0;
            a[1]=1;
            System.out.print(a[0]+" ");
            System.out.print(a[1]+" ");
            int i=2;
	while(i<n)
	{
		a[i]=a[i-1]+a[i-2];
		System.out.print(a[i]+" ");
		i++;
	}
}
}

