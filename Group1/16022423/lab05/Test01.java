/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
public class Test01 {
    public static void main(String[] args){
        Orange quacam = new Orange();
        quacam.setColor("Orange");
        
        Apple ap = new Apple();
        ap.setTaste("Ngot");
        ap.setCost(20000);
        
        orange_CaoPhong cp = new orange_CaoPhong();
        cp.setName("Cam CaoPhong");
        cp.setSource("Cao Phong, Hoa Binh");

        orange_Sanh cs = new orange_Sanh();
        cs.setImportDay("09/10/2018");
        cs.setNumber(500);
        
        System.out.println(quacam.getColor());
        System.out.println(ap.getTaste());
        System.out.println(ap.getCost());
        System.out.println(cp.getName());
        System.out.println(cp.getSource());
        System.out.println(cs.getImportDay());
        System.out.println(cs.getNumber());

    }
}
    
