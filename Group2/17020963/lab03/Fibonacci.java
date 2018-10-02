import java.util.Scanner;

public class Fibonacci {
	private int n;
//ham khoi tao so tu nhien n	
	public int getN() {
		return n;
	}
//ham nhap so tu nhien n	
	public void setNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap so tu nhien n = ");
        int x = input.nextInt();
		this.n = x;
	}
//
	public int Fibonaccii_so_thu_n(int n) {
        if ((n == 2) || (n == 3)) {
            return 1;
        } 
		else
           
            return Fibonaccii_so_thu_n(n-1) + Fibonaccii_so_thu_n(n-2);

    }
//ham main
	public static void main(String[] args) {
		Fibonacci Fb = new Fibonacci();
		Fb.setNumber();
		System.out.println("So Fibonacci thu " + Fb.getN() + " la: " + Fb.Fibonaccii_so_thu_n(Fb.getN()));
	}
}