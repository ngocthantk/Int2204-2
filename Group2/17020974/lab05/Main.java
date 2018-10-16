/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author admincxq
 */
public class Main {
    public static void main(String[]args){
        HoaQua hoaqua=new HoaQua();
        QuaCam quacam=new QuaCam();
        QuaTao quatao=new QuaTao();
        CamCaoPhong camcaophong=new CamCaoPhong();
        CamSanh camsanh=new CamSanh();
        Circle circle=new Circle(314);
        System.out.println(circle);
        Rectangle hcn=new Rectangle(4,9);
        System.out.println(hcn);
        Square hv=new Square(8);
        System.out.println(hv);
    }
}
