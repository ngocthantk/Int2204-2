package lab004;


	public class Mang {
		public static int min(int[] a) {
		int z=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<z)
				z=a[i];
		}
		return z;

	}


}
