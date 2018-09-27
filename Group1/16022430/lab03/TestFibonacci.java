import java.util.Scanner;
public class TestFibonacci{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Fibonacci fi = new Fibonacci();
    System.out.print("Nhap vao so: ");
    int n = input.nextInt(), i;
    System.out.println(n + " phan tu dau tien cua day fibonacci: ");
    for(i=0;i<=n;i++){
      System.out.print(fi.fibo(i) + " ");
    }
    System.out.print("\n");
  }
}
