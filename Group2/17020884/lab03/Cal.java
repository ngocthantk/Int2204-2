public class Cal {
	public int gcd (int a, int b) { // Greatest Common Divisor of a and b
		int r;
		while (b!=0) {
			r= a % b;
			a= b;
			b= r;
		}
		if (a<0) a= -a;
		return a;
	}
	
}
