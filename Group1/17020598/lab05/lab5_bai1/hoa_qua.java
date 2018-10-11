/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class hoa_qua {
    protected String loai;
    protected String hinh_thu; 
    protected String mui_vi;
    protected String mau_sac;

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getHinh_thu() {
        return hinh_thu;
    }

    public void setHinh_thu(String hinh_thu) {
        this.hinh_thu = hinh_thu;
    }

    public String getMui_vi() {
        return mui_vi;
    }

    public void setMui_vi(String mui_vi) {
        this.mui_vi = mui_vi;
    }

    public String getMau_sac() {
        return mau_sac;
    }

    public void setMau_sac(String mau_sac) {
        this.mau_sac = mau_sac;
    }
    public hoa_qua()
    {
        
    }   
    public hoa_qua(String loai, String hinh_thu, String mui_vi, String mau_sac)
    {
        this.loai = loai;
        this.hinh_thu = hinh_thu;
        this.mui_vi = mui_vi;
        this.mau_sac = mau_sac;
    }
    public String Hienthi(){
        return this.loai+" "+this.hinh_thu+" "+this.mui_vi+" "+this.mau_sac;
    }
}
