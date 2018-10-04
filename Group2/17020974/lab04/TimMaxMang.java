
public class TimMaxMang {
	public static int Min(int []a,int n) {
		int gan=a[0];
		for(int i=1;i<n;i++) {
			if(gan>a[i])
				gan=a[i];
		}
		return gan;
	}
}
