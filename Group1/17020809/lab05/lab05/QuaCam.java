/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class QuaCam extends HoaQua {
    protected int gia;
    protected String loai;

    public QuaCam(String name, String madein, int gia, String loai) {
        super(name, madein);
        this.gia = gia;
        this.loai = loai;
    }
    
    public int getGia(){
        return gia;
    }
    public void setGia(int gia){
        this.gia = gia;
    }
    public String getLoai(){
        return loai;
    }
    public void setLoai(String loai){
        this.loai = loai;
    }

    
}
