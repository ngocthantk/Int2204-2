/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phan_so;

/**
 *
 * @author MyPC
 */
import java.util.*;

public class Phan_so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int tu1 = s.nextInt(),
                mau1 = s.nextInt(),
                tu2 = s.nextInt(),
                mau2 = s.nextInt();
        PS PhanSo1 = new PS(tu1, mau1);
        PS PhanSo2 = new PS(tu2, mau2);
        PhanSo1.Cong(PhanSo2);
        PhanSo1.Tru(PhanSo2);
        PhanSo1.Nhan(PhanSo2);
        PhanSo1.Chia(PhanSo2);
        System.out.println(PhanSo1.equals(PhanSo2));

    }

}
