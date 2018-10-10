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
public class CamSanh extends Cam{
    private String date; // ngày nhập

    public CamSanh(String date, String madein, String ten, int gia) {
        super(madein, ten, gia);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
    
}
