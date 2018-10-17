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
// Lớp camsanh kế thừa từ lớp quacam

public class camSanh extends quaCam {
    private String kichthuoc; // Thuộc tính mới của lớp camSanh
     // Các constructor
    public camSanh() {
    }

    public camSanh(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public camSanh(String kichthuoc, int somui, int giaban, String ngaynhap, String nguongoc) {
        super(somui, giaban, ngaynhap, nguongoc);
        this.kichthuoc = kichthuoc;
    }
    
     
    // Hàm get set
    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }
      
}
