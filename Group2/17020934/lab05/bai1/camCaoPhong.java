/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuann_000
 */
public class camCaoPhong extends quaCam{
    private String nguonGoc;
    private int giaBan;

    public camCaoPhong(String chungLoai, String muiVi) {
        super("cam cao phong", "ngot");
    }

    
    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    
    

    
    
}
