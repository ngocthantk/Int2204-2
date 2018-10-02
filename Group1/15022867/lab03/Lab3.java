/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab3 thao =new Lab3();
        System.out.println ("nhap vao 2 so a va b: ");
        Scanner sc = new Scanner(System.in);
        int a,b, UCLN,n = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println (thao.UCLN(a,b));
        System.out.println (thao.fibonaxi(n));
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
    int f =0;
    if(n ==0) return f;
    else if(n==1) return 1;
    else{
        return fibonaxi(n-2) + fibonaxi(n-1);
    }
}
}