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
public class bai1 {
    public static void main(String[] args) {
        HoaQua[] traiCay = new HoaQua[4];
        traiCay[0] = new QuaTao();
        traiCay[1] = new QuaCam();
        traiCay[2] = new CamCaoPhong();
        traiCay[3] = new CamSanh();
        HoaQua qua = new HoaQua();
        qua.loaiVo();
        for(int i = 0;i <4;i++){
            traiCay[i].loaiVo();
        }
    }
}
