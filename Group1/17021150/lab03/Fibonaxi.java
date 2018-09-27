/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class  Fibonaxi {
  /* public int fibo(int a){
       if(a==1)return 1;
       if(a==0)return 0;
       return (fibo(a-1)+fibo(a-2))
   }*/
 
   public static int fibo(int n){
       int a=0,b=1,kq=0;
    for(int i=2;i<=n;i++){
        kq=a+b;
        a=b;
        b=kq;
    }
    if(n==0){kq=0;}
    if(n==1){kq=1;}
    return(kq);
   }
   public static void main(String[] sad){
    Scanner sc=new Scanner(System.in);
    System.out.print("nhap n: ");
    int n=sc.nextInt();
    
   System.out.println(fibo(n));
}
}
