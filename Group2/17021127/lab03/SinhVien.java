/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCNE
 */
public class SinhVien {
    String name;
    String khoa;
    int MSSV;
    boolean gender;
    public void setName(String name){
        this.name = name;
    }
    public void setKhoa(String khoa){
        this.khoa = khoa;
    }
    public void setMSSV(int mssv){
        this.MSSV = mssv;
    }
    public void setGender(boolean gender){
        this.gender = gender;
    }
    public String getName(){return this.name;}
    public String getKhoa(){return this.khoa;}
    public int getMSSV(){return this.MSSV;}
    public boolean getGender(){return this.gender;}
}
