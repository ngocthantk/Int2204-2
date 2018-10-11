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
public class quaTao extends hoaQua {
    private int soluong;

     // Các constructor
    public quaTao() {
    }

    public quaTao(int soluong) {
        this.soluong = soluong;
    }

    public quaTao(int soluong, int giaban, String ngaynhap, String nguongoc) {
        super(giaban, ngaynhap, nguongoc);
        this.soluong = soluong;
    }
    

    // Hàm get set
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
}
