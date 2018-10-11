/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class HoaQuaMain {
    public static void main(String[] args){
        HoaQua q = new HoaQua("Qua", "VN");
        System.out.println(q.getName());
        System.out.println(q.getMadein());
        QuaCam c = new QuaCam("Cam","VN",20,"Sanh");
        System.out.println(c.getName());
        System.out.println(c.getMadein());
        System.out.println(c.getGia());
        System.out.println(c.getLoai());
        CamCaoPhong p = new CamCaoPhong("Cam","VN",25,"Cao Phong",100);
        System.out.println(p.getName());
        System.out.println(p.getMadein());
        System.out.println(p.getGia());
        System.out.println(p.getLoai());
        System.out.println(p.getSoluong());
    }
    
}
