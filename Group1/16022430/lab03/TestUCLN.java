import java.util.Scanner;
public class TestUCLN{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  UCLN uc = new UCLN();
  System.out.print("Nhap vao so thu nhat: ");
  int a = input.nextInt();
  System.out.print("Nhap vao so thu hai: ");
  int b = input.nextInt();
  int c = uc.gcd(a, b);
  System.out.println("uoc chung lon nhat cua " + a + " va " + b + ": " + c);
  }
}