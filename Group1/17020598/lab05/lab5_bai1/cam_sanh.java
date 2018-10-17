/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class cam_sanh extends qua_cam{
    private String nguon_goc;
    public cam_sanh(){
        
    }
    public cam_sanh(String loai, String hinh_thu, String mui_vi, String mau_sac,int so_luong, String nguon_goc){
        super(loai, hinh_thu, mui_vi, mau_sac, 0);
        this.nguon_goc = nguon_goc;
    }
    
    
}
