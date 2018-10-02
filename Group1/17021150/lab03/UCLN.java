/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author admin
 */
class ab {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}

public class UCLN {

    public static int tinh(int x, int y) {
        int kq;
        if ((x > 1) && (y > 1)) {
            while ((x > 0) && (y > 0)) {
                if (x >= y) {
                    x = x - y;
                } else {
                    y = y - x;
                }
            }
        }
        if (x != 0) {
            kq = x;
        } else {
            kq = y;
        }
        return (kq);
    }

    public static void main(String[] args) {

        ab so = new ab();
        so.setA(25);
        so.setB(10);
        System.out.println("2 so la: " + so.getA() + "&" + so.getB());
        if ((so.getA() > 0) && (so.getB() > 0)) {
            System.out.println("kq la: " + tinh(so.getA(), so.getB()));
        } else {
            System.out.println("a va b phai lon hon 0");
        }
    }

}
