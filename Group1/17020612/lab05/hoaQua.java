/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Admin
 */
public class hoaQua {
    prot int giaban; // Khởi tạo các thuộc tính
    private String ngaynhap;
    private String nguongoc;

    // Các constructor
    public hoaQua() {
    }

    public hoaQua(int giaban, String ngaynhap, String nguongoc) {
        this.giaban = giaban;
        this.ngaynhap = ngaynhap;
        this.nguongoc = nguongoc;
    }
    
   // Hàm get set
    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }
}
