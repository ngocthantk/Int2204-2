/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Dat Anh
 */
public class hoaQua {
    protected String loai;
    protected String hinh_dang;
    public String getLoai()
    {
        return this.loai;
    }
    public String getHinhdang(){
        return this.hinh_dang;
    }
    public void setLoai(String l)
    {
        this.loai = l;
    }
    public void setHinhDang(String hd)
    {
        this.hinh_dang = hd;
    }
    public String getName()
    {
        return "Hoa Qua";
    }

}
