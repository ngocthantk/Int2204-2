/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Ha
 */

public class Cam extends HoaQua {
    private String madein; // nguồn gốc xuất xứ

    public Cam(String madein, String ten, int gia) {
        super(ten, gia);
        this.madein = madein;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }
    
}
