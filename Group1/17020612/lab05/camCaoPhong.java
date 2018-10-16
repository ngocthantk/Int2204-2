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
public class camCaoPhong extends quaCam {
    private String soluong;
    
     // Các constructor
    public camCaoPhong() {
    }

    public camCaoPhong(String soluong) {
        this.soluong = soluong;
    }

    public camCaoPhong(String soluong, int somui, int giaban, String ngaynhap, String nguongoc) {
        super(somui, giaban, ngaynhap, nguongoc);
        this.soluong = soluong;
    }
    

    // Hàm get set
    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
    
}
