/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class qua_tao extends hoa_qua{
    private String chat_luong;
    public qua_tao(){
        
    }
    public qua_tao(String loai, String hinh_thu, String mui_vi, String mau_sac, String cl){
        super(loai, hinh_thu, mui_vi, mau_sac);
        this.chat_luong = cl;
    }

    public String getChat_luong() {
        return chat_luong;
    }

    public void setChat_luong(String chat_luong) {
        this.chat_luong = chat_luong;
    }
    
}
