/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Ha
 */

public class QuaTao extends HoaQua{
    private int loai; // hàng loại 

    public QuaTao(int loai, String ten, int gia) {
        super(ten, gia);
        this.loai = loai;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }
    
}
