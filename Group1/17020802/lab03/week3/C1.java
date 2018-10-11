package week3;

class C1 {
  public int uocchungMax (int a, int b){
    if (b == 0) return a;
    return uocchungMax(b, a % b);
  }
  public int Fibonaci(int n) {
	  if (n == 0) return 0;
	  if (n == 1) return 1;
	  return Fibonaci(n-1) + Fibonaci(n-2);
  }
  public static void main(String[] args){
	  C1 n = new C1();
    System.out.printf("Uoc chung lon nhat cua 2 so : %s\n", n.uocchungMax(-15, 5));
    System.out.printf("Fibonaci cua n: %s", n.Fibonaci(8));
  }
}

