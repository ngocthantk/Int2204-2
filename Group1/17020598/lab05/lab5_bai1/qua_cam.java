/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class qua_cam extends hoa_qua{
    private int so_luong;
    public qua_cam(){
        
    }
     public qua_cam(String loai, String hinh_thu, String mui_vi, String mau_sac,int  so_luong){
        super(loai, hinh_thu, mui_vi, mau_sac);
        this.so_luong = so_luong;
    }

    public int getso_luong() {
        return so_luong;
    }

    public void setso_luong(int so_luong) {
        this.so_luong = so_luong;
    }
    
}
