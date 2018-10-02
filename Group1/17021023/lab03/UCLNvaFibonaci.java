package uclnvafibonaci;

import java.util.Scanner;

public class UCLNvaFibonaci {
    
    public static int UocChung(int a, int b) {
        if ( b == 0) return a;
        else return UocChung(b, a % b);
    }
    
    public static int Fibonaci( int n) {
        if ( n == 0) return 0;
        if ( n == 1) return 1;
        else {
            return Fibonaci( n -1) + Fibonaci( n - 2);
        }
    }

    
    public static void main(String[] args) {
         
        System.out.println("Tinh uoc chung lon nhat cua hai so nguyen duong.");
        System.out.println("Moi nhap hai so nguyuen duong a va b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int uoc = UocChung(a, b);
        System.out.println("Uoc chung lon nhat cua hai so tren la: " + uoc);
        
        System.out.println("Nhap so can tinh Fibonaci: ");
        int n = sc.nextInt();
        int Fi = Fibonaci(n);
        System.out.println("So Fibonaci la: " + Fi);
        
    }   
}
