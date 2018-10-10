package t4;

public class MinMax {
	public static int max(int a, int b) {
		if (a>=b) return a;
		return b;
	}
	public static int min(int[] a) {
		int min=a[0];
		for (int i=1; i<a.length; i++) {
			if (min>a[i]) min = a[i];
		}
		return min;
	}
}
