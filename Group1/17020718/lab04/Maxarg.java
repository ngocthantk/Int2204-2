package lap04.java;

public class Maxarg {
	public static int maxargs (int a[]) {
		int maxarg = a[0];
		for (int i : a) {
			if (i<maxarg) maxarg = i;
		}
		return maxarg;
	}
	
}
