/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class cam_cao_phong extends qua_cam{
    private int gia_ban;
    public cam_cao_phong()
    {
        
    }   
    public cam_cao_phong(String loai, String hinh_thu, String mui_vi, String mau_sac, int gia_ban){
        super(loai, hinh_thu, mui_vi, mau_sac, gia_ban);
        this.gia_ban = gia_ban;
    }

    public int getGia_ban() {
        return gia_ban;
    }

    public void setGia_ban(int gia_ban) {
        this.gia_ban = gia_ban;
    }
    
}
