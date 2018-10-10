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
public class QuaCam extends HoaQua{

    public QuaCam(){}
    
    public QuaCam(float canNang, float trangThai, float giaBan, float soLuong) {
        super(canNang, trangThai, giaBan, soLuong);
    }
    @Override
    //dac trung chung cua qua cam
    public void loaiVo(){
        System.out.println("vo day, boc ra co nuoc");
    };
}
