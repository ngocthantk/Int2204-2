/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Asus
 */
public class CamCaoPhong extends QuaCam {
    private int GiaBan;         //giá bán
    public CamCaoPhong(){         //khởi tạo giá
        super();
        this.GiaBan=5000;
    }
    public void setGiaBan(int GiaBan){    //cài giá
       this.GiaBan=this.getSoLuong()*GiaBan;
    }
    public int getGiaBan(){             //lấy giá
        return this.GiaBan;
    }
}
