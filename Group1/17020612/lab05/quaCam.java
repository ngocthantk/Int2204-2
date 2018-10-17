/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Admin
 */
public class quaCam extends hoaQua {
    private int somui; // số múi cam
   
     // Các constructor
    public quaCam() {
        super();
    }

    public quaCam(int somui) {
        super();
        this.somui = somui;
    }
    public quaCam(int somui,int giaban, String ngaynhap, String nguongoc) {
        super(giaban,ngaynhap,nguongoc);
        this.somui = somui;
    }
    
    
    // Hàm get set
    public int getSomui() {
        return somui;
    }

    public void setSomui(int somui) {
        this.somui = somui;
    }
         
}
