/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3;

/**
 *
 * @author FEELSBADMAN
 */
public class tuan3 {//câu 1

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tuan3 x;
        x = new tuan3();

        System.out.println(x.ucln(4, -2));
        System.out.println(x.fibo(6));
        PhanSo a = new PhanSo(-1, 2);
        PhanSo b = new PhanSo(1, -2);
        System.out.println(a.equals(b));
        a.tru(b);
        a.print();
        System.out.println(a.equals(b));

    }

    public int ucln(int a, int b) {//thuật toán euclid
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int fibo(int n) {
        int[] a;
        a = new int[100];
        a[0] = 0;
        a[1] = 1;
        int i;
        for (i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];

    }
}
