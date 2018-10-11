/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

public class QuaCam extends HoaQua {

    private int SoLuong;       //số lượng quả can
    public QuaCam(){
        super();
        this.SoLuong=100;        //khởi tạo mặc định
    }
    public void setSoLuong(int SoLuong){     //cài số lượng
        this.SoLuong=SoLuong;
    }
    public int getSoLuong(){          //lấy số lượng
        return this.SoLuong;
    }


}
