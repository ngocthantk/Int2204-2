/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MyPC
 */
public class QuaCam extends HoaQua{
     String Loai;

    public QuaCam(String name, String madein, String loai) {
        super(name, madein);
        this.Loai = loai;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getName() {
        return this.name;
    }

  
    public String getMadein() {
        return this.madein;
    }

    public String getLoai() {
        return Loai;
    }
  
   
   
}
