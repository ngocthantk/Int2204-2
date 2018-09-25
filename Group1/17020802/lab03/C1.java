import java.util.Scanner;

class C1 {
  private static Scanner inp = new Scanner(System.in);
  protected int a, b;
  public static int uocchungMax (int a, int b){
    if (b == 0) return a;
    return uocchungMax(b, a % b);
  }
  public static int Fibonaci(int n) {
	  if (n == 0) return 0;
	  if (n == 1) return 1;
	  return Fibonaci(n-1) + Fibonaci(n-2);
  }
  public static void main(String[] args){
    int a = inp.nextInt();
    int b = inp.nextInt();
    int n = inp.nextInt();
    System.out.printf("Uoc chung lon nhat cua 2 so : %s", uocchungMax(a, b));
    System.out.printf("Fibonaci cua n: %s", Fibonaci(n));
  }
}

