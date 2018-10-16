/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class GV {
    String name;
    String monhoc;
    String trinhdo;
    boolean gender;
     public void setName(String name){
        this.name = name;
    }
    public void setMonHoc(String monhoc){
        this.monhoc = monhoc;
    }
    public void setTrinhDo(String trinhdo){
        this.trinhdo = trinhdo;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    public String getName(){return this.name;}
    public String getMonHoc(){return this.monhoc;}
    public String getTrinhDo(){return this.trinhdo;}
    public boolean getGender(){return this.gender;}
}
