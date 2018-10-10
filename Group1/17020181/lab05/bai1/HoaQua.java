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
public class HoaQua {

    private String ten; // tên sản phẩm
    private int gia; // giá thành

    public HoaQua(String ten, int gia) {
        this.ten = ten; 
        this.gia = gia; 
    }
    
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public int getGia() {
        return gia;
    }
    public void setGia(int gia) {
        this.gia = gia;
    }
    
}
