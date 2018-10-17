package function2;

public class function2 {
	
	public static int min(int[] a) {
		int x = a[0];
		for (int i=0; i<a.length; i++) {
			if ( x > a[i] ) x = a[i];
		}
		return x;
	}

}
