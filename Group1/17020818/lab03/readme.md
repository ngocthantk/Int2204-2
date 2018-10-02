package lab_02;

import java.util.Scanner;

public class uc {
	private static Scanner inp = new Scanner(System.in);
	protected int a, b;
	public  static int ucln (int a, int b){
	    if (b == 0) return a;
	    return ucln(b, a % b);
	  }
	  public static int Fibonaci(int n) {
		  if (n == 0) return 0;
		  if (n == 1) return 1;
		  return Fibonaci(n-1) + Fibonaci(n-2);
	  }
	  public static void main(String[] args){
		  System.out.printf("Nhap so nguyen a:"); 
	      int a = inp.nextInt();
	      System.out.printf("Nhap so nguyen b:"); 
	      int b = inp.nextInt();
	      System.out.printf("Nhap so nguyen n:");
	      int n = inp.nextInt();
	      System.out.printf("Uoc chung lon nhat cua 2 so : %s  \n", ucln(a, b));
	      System.out.printf("Fibonaci cua n: %s", Fibonaci(n));
       }
}
