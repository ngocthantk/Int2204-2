/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

public class CamSanh extends QuaCam {
    private int GiaBan;    
    public CamSanh(){             //khởi tạo mặc định
        super();
        this.GiaBan=10000;
    }
    public void setGiaBan(int GiaBan){     //tính gía bán
       this.GiaBan=this.getSoLuong()*GiaBan;    
    }
    public int getGiaBan(){      //lấy giá bán
        return this.GiaBan;
    }
}
