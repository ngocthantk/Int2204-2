package EX1;

import java.util.Scanner;

public class Fibo {
	private int n;
// Khỏi tạo n
	public int getN() {
		return n;
	}
//Nhập n	
	public void setNumber() {
		System.out.print("Nhap so tu nhien n: ");
		n = new Scanner(System. in).nextInt();
	}
//Tính số FIbo
	public int Fibonacci(int n) {
        if (n==0) return 0;
        if ((n ==1 )) {
            return 1;
        } 
		else
            return Fibonacci(n-1) + Fibonacci(n-2);

    }
//ham main
	public static void main(String[] args) {
		Fibo Fb = new Fibo();
		Fb.setNumber();
		System.out.println( Fb.Fibonacci(Fb.getN()));
	}
}
