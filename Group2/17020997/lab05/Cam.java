/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Ha
 */
import java.util.Scanner;

public class Cam extends HoaQua {
    
    public int loai;
    
    public Cam() {
        ten = "Cam";
        nguon = "Made in Vietnam";
        ngay = "10/5/2018";
        soluong = 50;
    }
    
    public void inputLoai() {
        System.out.print("Hàng loại: ");
        Scanner sc = new Scanner(System.in);
        loai = sc.nextInt();
    }
    
    public void TinhGiaBan() {
        if(loai == 1) {
            gia = 25000;
        }
        else {
            gia = 15000;
        }
    }
    
}
