/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_bai1;

import java.util.Scanner;

/**
 *
 * @author AnhTam
 */
public class UCLN {
    public static void main(String[] args) {
        System.out.println("Nhap so a = ");
        int a =nhap();
        System.out.println("Nhap so b =");
        int b = nhap();
        UCLN(a,b);
        System.out.println(""+UCLN(a,b));
    }
 
public static int nhap(){
    Scanner nhap = new Scanner(System.in);
    int n  = nhap.nextInt();
    return(n);
}
    
public static int UCLN(int a, int b){
   while(a!=b)
   {
       if(a>b)a = a-b;
       else b=b-a;
   }
   return (a);
   
}
}
