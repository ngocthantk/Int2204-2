/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Nhozx
 */
//lop HoaQua la lop cha
public class HoaQua {
    protected float canNang;
    protected float trangThai;
    protected float giaBan;
    protected float soLuong;
    //ham khoi tao khong tham so
    public HoaQua() {}
    //ham khoi tao co tham so
    public HoaQua(float canNang, float trangThai, float giaBan, float soLuong){
        this.canNang = canNang;
        this.trangThai = trangThai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }
    //cac ham getter setter
    public float getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    public float getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(float trangThai) {
        this.trangThai = trangThai;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }
        // dac trung chung cua cac loai hoa hoa
    public void loaiVo(){
        System.out.println("mot so co vo, day hay mong tuy loai");
    }
}
