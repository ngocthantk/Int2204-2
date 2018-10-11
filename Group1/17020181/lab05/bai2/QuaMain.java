/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Ha
 */

import bai1.Cam;
import bai1.QuaTao;
import bai1.CamCaoPhong;
import bai1.CamSanh;

public class QuaMain {
    public static void main(String[] args) {
        // thử nghiệm vs quả Cam
        Cam cam = new Cam( "Việt Nam","Cam", 10000);
        System.out.println("Tên sp: " + cam.getTen());
        System.out.println("Xuất xứ: " +cam.getMadein());
        System.out.println("Giá: " + cam.getGia());
        System.out.println();
        // quatao
        QuaTao tao = new QuaTao(1,"Táo",15000);
        System.out.println("Tên sp: " + tao.getTen());
        System.out.println("Hàng loại: " + tao.getLoai());
        System.out.println("Giá: " + tao.getGia());
        System.out.println();
        // cam cao phong
        CamCaoPhong camcp = new CamCaoPhong("Trung Quốc","Cam Cao Phong", 20000);
        System.out.println("Tên: " + camcp.getTen());
        System.out.println("Xuất xứ: " + camcp.getMadein());
        System.out.println("Giá: " + camcp.getGia());
        System.out.println();
        // Cam Sành
        CamSanh cams = new CamSanh("10/9/2018", "Hòa Bình - Việt Nam","Cam Sành",  45000);
        System.out.println("Tên sp: " + cams.getTen());
        System.out.println("Ngày nhập: " + cams.getDate());
        System.out.println("Xuất xứ: " + cams.getMadein());
        System.out.println("Giá: " + cams.getGia());
        System.out.println();
    }
}
