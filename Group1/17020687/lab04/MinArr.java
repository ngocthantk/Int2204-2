package test;


public class MinArr {
	private int n;
	private int[] a =new int[n];
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	
	public static int minArr(int a[])
	{
		int Min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<Min) Min = a[i];
		}
		 
		return Min;
	}
	
}

