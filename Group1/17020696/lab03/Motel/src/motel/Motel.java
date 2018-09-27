/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motel;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Motel {
    private int sophong;
    private String nguoithue;
    private float gia;

    public int getSoPhong() {
        return sophong;
    }

    public void setSoPhong(int a) {
        this.sophong = a;
    }

    public String getNguoithue() {
        return nguoithue;
    }

    public void setNguoithue(String a) {
        this.nguoithue = a;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    
    public void showTt(){
        System.out.println("Thong tin nguoi thue: " + this.getNguoithue());
        System.out.println("So phong: " + this.getSoPhong());
        System.out.println("Gia thue: " + this.getGia());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motel m = new Motel();
        m.showTt();
        // TODO code application logic here
    }
    
}
