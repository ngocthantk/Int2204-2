import java.util.Scanner;
public class Test1{
public int Uoc(int num1, int num2){
if(num2 == 0) return num1;
return Uoc(num2, num1%num2);
}
public int Fibo(int n){
if(n==0) return 0;
if(n==1) return 1;
else return Fibo(n-1) + Fibo(n-2);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a,b,n;
a = sc.nextInt();
System.out.println("Nhap a: " +a);
b = sc.nextInt();
System.out.println("Nhap b: " +b);
n = sc.nextInt();
System.out.println("Nhap n: " +n);
Test1 Tinh = new Test1();
System.out.println("Uoc chung lon nhat la: " +Tinh.Uoc(a,b));
System.out.print("So Fibonaci thu n la: " +Tinh.Fibo(n));
}
}

