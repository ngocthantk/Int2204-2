/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author Nhozx
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bai1 thu = new bai1();
        System.out.println("nhap vao 2 so: ");
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(thu.UCLN(a,b));
//        System.out.println("nhap vao so n: ");
        int n;
 //       n = sc.nextInt();
        System.out.println(thu.fibonaxi(6));
        PS ps1 = new PS(4,8);
        PS ps2 = new PS(12,-10);
        PS ps3 = new PS(-6,5);
        System.out.println(ps1.toString());
        System.out.println(ps1.equals(ps2));
        System.out.println(ps2.equals(ps3));
        System.out.println(ps1.Addition(ps2).toString());
    }
    
    public int UCLN(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 ) return b;
        if(b == 0 ) return a;
        while(a % b != 0 && b % a != 0){
            if(a > b) {
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if(a > b) return b;
        else return a;
    }
    
    public int fibonaxi(int n){
        int f = 0;
        if(n == 0) return f;
        else if(n == 1) return 1;
        else {
            f = fibonaxi(n-2) + fibonaxi(n-1);
            return f;
        }
    }
}
