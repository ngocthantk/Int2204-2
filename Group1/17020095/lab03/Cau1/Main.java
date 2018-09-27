public class Main{
	public int UCLN(int a,int b){
		return (b != 0)?UCLN(b,a%b):a;
	}	

	public int Fibonaci(int n){
		int[] F = new int[n+1];
		F[0] = 0;
		F[1] = 1;
		for(int i = 2 ; i <= n ; ++i){
			F[i] = F[i-1] + F[i-2];
		}
		return F[n];
	}

	public static void main(String args[]){
		Main m = new Main();
		System.out.println(m.UCLN(-15,5));
		System.out.println(m.Fibonaci(5));
	}
}


