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
public class Cam extends HoaQua{
    String gia;
    String loaicam;
    String nguongoc;
    public Cam(){
     this.tenhoaqua="cam";
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    public String getLoaicam() {
        return loaicam;
    }

    public void setLoaicam(String loaicam) {
        this.loaicam = loaicam;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getGia() {
        return gia;
    }
      public void getinfo(){
        System.out.println("hoa qua nhap vao: " +this.tenhoaqua+"\n loai cam: "+this.loaicam+"\n gia: "+this.gia+"\n so luong: "+this.soluong+"\n ngay nhap: "+this.ngaynhap+"\n xuat xu: "+this.nguongoc);
    
}
    
    
}
