import java.util.Scanner;
public class B1Lab03{
  public static void main(String[] args){
    int a, b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();                         //Nhap a
    b = sc.nextInt();                         //Nhap b
    System.out.println(UCLN(a,b));            //In ra UCLN cua a va b
    int n;
    n = sc.nextInt();                         //Nhap n
    System.out.println(Fibo(n));   //In ra phan tu thu n trong day Fibonaci
  }
  /*---------------------------------------------------------
   Tim uoc chung lon nhat */
  public static int UCLN(int x, int y){
    x = Math.abs(x);
    y = Math.abs(y);
    while (x != y){
      if (x > y) x = x - y;
      else y = y - x;
    }
    return x;
  }
  /*---------------------------------------------------------
  Day Fibonaci */
  public static int Fibo(int x){
    if (x < 2) return x;
    else return  Fibo(x-1) + Fibo(x-2);
  }
}
