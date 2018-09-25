/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Le Quang Vu
 */
public class Student {
    private String hoten;
    private String lophoc;
    private String masv;
    private String email;
    
    public void setHoTen(String n){
        hoten = n;
    }
    public void setLopHoc(String n){
        lophoc = n;
    }
    public void setMasv(String n){
        masv = n;
    }
    public void setEmail(String n){
        email = n;
    }
    public String getHoTen(){
        return hoten;
    }
    public String getLopHoc(){
        return lophoc;
    }
    public String getMasv(){
        return masv;
    }
    public  String getEmail(){
        return email;
    }
    public String getInfo(){
        return hoten+"\n"+lophoc+"\n"+masv+"\n"+email+"\n";
    }
    public Student(){
        hoten = "Student";
        lophoc="INT22041";
        masv="17021135";
        email="uet@vnu.edu.vn";
    }
    public Student(String ht, String ma, String em){
        hoten = ht;
        masv = ma;
        lophoc ="INT22041";
        email = em;
    }
    public Student(Student s){
        hoten = s.hoten;
        masv = s.masv;
        lophoc = s.lophoc;
        email = s.email;
    }
}