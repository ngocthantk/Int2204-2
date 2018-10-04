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
public class Phan_B {

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap so nguyen n= ");
            n = nhap();
        } while (n <= 0);
        Fibonaxi(n);

    }

    public static int nhap() {
        Scanner nhap = new Scanner(System.in);
        int n = nhap.nextInt();
        return (n);
    }

    public static void Fibonaxi(int n) {
        int f0 = 0, f1 = 1, f2 = 1, f3;
        System.out.print("" + f0 + "  " + f1 + "  " + f2);
        f3 = f2 + f1;
        while (f3 <= n) {
            System.out.print(" ", f3);
            f1 = f2;
            f2 = f3;
            f3 = f2 + f1;
        }
    }

}
