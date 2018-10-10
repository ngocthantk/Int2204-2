/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Nhozx
 */
public class bai2 {
    public static void main(String[] args){
        Circle hinhTron = new Circle(3.5, "do", false );
        System.out.println(hinhTron.toString());
        System.out.println("dien tich"+hinhTron.getArea());
        System.out.println("chu vi hinh tron" + hinhTron.getPerimeter());
        Rectangle hinhCN = new Rectangle(4, 5, "luc", true);
        System.out.println(hinhCN.toString());
        System.out.println("dien tich hinh chu nhat"+hinhCN.getArea());
        System.out.println("chu vi hinh chu nhat" + hinhCN.getPerimeter());
        Square hinhVuong = new Square(4,"xanh", true);
        System.out.println(hinhVuong.toString());
        System.out.println("dien tich hinh vuong"+hinhVuong.getArea());
        System.out.println("chu vi hinh vuong" + hinhVuong.getPerimeter());
        hinhVuong.setSide(6);
        System.out.println("dat lai do dai la 6. Thong tin: "+ hinhVuong.toString());
        Shape hinh = new Shape("tim", true);
        System.out.println(hinh.toString());
    }
}
