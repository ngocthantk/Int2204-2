/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuann_000
 */
public abstract class hoaQua {
    
    protected String ten;
    public hoaQua(){
    this. ten = getTenHoaQua();
}
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public abstract String getTenHoaQua();
}
