/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Nhozx
 */
public class QuaTao extends HoaQua{
    public String doCungCuaLoi;
    //ham khoi tao khong tham so
    public QuaTao(){}
    //ham khoi tao co tham so
    public QuaTao(float canNang, float trangThai, float giaBan, float soLuong) {
        super(canNang, trangThai, giaBan, soLuong);
    }
    //override lai cua hoa qua, ham loai vo neu len dac tinh cua vo
    @Override
    public void loaiVo(){
        System.out.println("vo mong, khong co nuoc");
    }
}
