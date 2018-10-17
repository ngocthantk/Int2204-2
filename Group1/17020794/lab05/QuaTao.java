/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

public class QuaTao extends HoaQua{
    private int SoLuong; //số lượng
    public QuaTao(){    //khởi tạo mặc định
        super();
        this.SoLuong=100;
    }
    public void setSoLuong(int SoLuong){     //cài số lượng
        this.SoLuong=SoLuong;
    }
    public int getSoLuong(){             //lấy số lượng
        return this.SoLuong; 
    }
}
