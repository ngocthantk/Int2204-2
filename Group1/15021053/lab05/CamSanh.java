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
public class CamSanh extends QuaCam{
//ham khoi tao khong tham so
    public CamSanh(){}
    //ham khoi tao co tham so
    public CamSanh(float canNang, float trangThai, float giaBan, float soLuong) {
        super(canNang, trangThai, giaBan, soLuong);
    }
    @Override
    public void loaiVo(){
        System.out.println("san sui, nuoc dang");
    }
}
