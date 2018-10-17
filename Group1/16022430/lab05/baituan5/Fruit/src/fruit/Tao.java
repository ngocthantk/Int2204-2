/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

/**
 *
 * @author nguyen
 */
public class Tao extends HoaQua {
    String gia;
    String loaitao;
    String nguongoc;
    public Tao(){
        this.tenhoaqua="tao";
    }
    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getLoaitao() {
        return loaitao;
    }

    public void setLoaitao(String loaitao) {
        this.loaitao = loaitao;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }
      public void getinfo(){
        System.out.println("hoa qua nhap vao: \n" +this.tenhoaqua+"\n loai tao : "+this.loaitao+"\n gia: "+this.gia+"\n so luong: "+this.soluong+"\n ngay nhap: "+this.ngaynhap+"xuat xu: \n"+this.nguongoc);
    
}
    
    
}
