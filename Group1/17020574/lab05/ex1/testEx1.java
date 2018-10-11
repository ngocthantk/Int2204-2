/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Dat Anh
 */
public class testEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        camCaophong camcaophong = new camCaophong();
        quaTao quatao = new quaTao();
    	camcaophong.setGiaban(100);
        camcaophong.setLoai("hai");
        quatao.setXuatXu("Trungquoc");
    	System.out.println(camcaophong.getName() + " " + camcaophong.getGiaban());
        System.out.println(quatao.getName() + " " + quatao.getXuatXu());
    }
    
}
