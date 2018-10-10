package lab03;

public class Fibonaxi {	
	
	public long getFiboNo(int n) { // get Fibonaxi no n
		if (n==0) return 0;
		if (n==1) return 1;
		return (getFiboNo(n-1) + getFiboNo(n-2));
	}
}
