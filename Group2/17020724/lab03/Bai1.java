public class Bai1 {
	public static void main (String[] abc){
		Bai1 b1 = new Bai1();
		int a = -15, b = 5;
		System.out.printf("GCD(%d,%d) = %d \n",a,b,b1.findGCD(a,b));
		int n = 10;
	    System.out.println("day Fibonacci: ");
		for(int i=0; i<n; i++){
		   System.out.printf("%d ",b1.Fibo(i));
		}
	}
  // tim UCLN 
	public int findGCD(int a, int b){
		a = Math.abs(a);
		b = Math.abs(b);
		if(b == 0) return a;		  
	    return findGCD(b, a%b);
	}
	  
	public int Fibo(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		return (Fibo(n-1) + Fibo(n-2));
	}
}
