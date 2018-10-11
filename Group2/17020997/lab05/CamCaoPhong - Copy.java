/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MyPC
 */
public class CamCaoPhong extends QuaCam{
    String NguonGoc;
    String GiaBan;

    public CamCaoPhong(String name, String madein, String loai) {
        super(name, madein, loai);
        
    }

    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setNguonGoc(String NguonGoc) {
        this.NguonGoc = NguonGoc;
    }

    public String getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(String GiaBan) {
        this.GiaBan = GiaBan;
    }

}
    
    

