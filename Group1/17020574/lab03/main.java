/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author Dat Anh
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PS temp1 = new PS(-6, 5);
        PS temp2 = new PS(6, -5);
        temp1.InPS();
        System.out.print(" = ");
        temp2.InPS();
        System.out.println(" : " + temp1.equals(temp2));
        PS cong = temp1.cong(temp2);
        temp1.InPS();
        System.out.print(" + ");
        temp2.InPS();
        System.out.print(" = ");
        cong.InPS();
        System.out.println();
        
        PS tru = temp1.tru(temp2);
        temp1.InPS();
        System.out.print(" - ");
        temp2.InPS();
        System.out.print(" = ");
        tru.InPS();
        System.out.println();
        
        PS nhan = temp1.nhan(temp2);
        temp1.InPS();
        System.out.print(" * ");
        temp2.InPS();
        System.out.print(" = ");
        nhan.InPS();
        System.out.println();
        
        PS chia = temp1.chia(temp2);
        temp1.InPS();
        System.out.print(" / ");
        temp2.InPS();
        System.out.print(" = ");
        chia.InPS();
        System.out.println();
        
    }    
}
