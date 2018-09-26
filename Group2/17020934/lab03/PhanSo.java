/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhanSo;

import java.util.Scanner;

/**
 *
 * @author tuann_000
 */
public class PhanSo {
    private int Tu, Mau;
    // Khởi tạo
    public int getTu(){
        return Tu;
    }
    public int getMau(){
        return Mau;
    }
    // nhập tử số và mẫu sô
    public void NhapPhanSo(){
        System. out.println("Nhap vao tu so:");
                this.Tu=new Scanner(System.in).nextInt();
        System. out.println("Nhap vao mau so:");
                this.Mau=new Scanner(System.in).nextInt();       
    }
    //Tìm UCLN của 2 số nguyên
   public int Ucln(int a,int b){
       if (a==0)return b;
       else return Ucln(b,a%b);    
    }
   //Rút gọn phân số
   public void RutGon(){
       PhanSo p=new PhanSo();
       p.Mau=p.Mau/Ucln(p.Tu, p.Mau);
       p.Tu=p.Tu/Ucln(p.Tu, p.Mau);
       if (p.Mau<0){
           p.Mau=-p.Mau;
           p.Tu=-p.Tu;
       }
   }
   // Cộng hai phân số
   public PhanSo Cong( PhanSo p2){
       PhanSo p3=new PhanSo();
       p3.Tu=this.Tu*p2.Mau+p2.Tu*this.Mau;
       p3.Mau=p2.Mau*this.Mau;
       p3.RutGon();
       return p3;
   }
   // Trừ hai phân số
   public PhanSo Tru( PhanSo p2){
       PhanSo p3=new PhanSo();
       p3.Tu=this.Tu*p2.Mau-p2.Tu*this.Mau;
       p3.Mau=p2.Mau*this.Mau;
       p3.RutGon();
       return p3;
   }
   //Nhân hai phân số
   public PhanSo Nhan( PhanSo p2){
       PhanSo p3=new PhanSo();
       p3.Tu=this.Tu*p2.Tu;
       p3.Mau=p2.Mau*this.Mau;
       p3.RutGon();
       return p3;
   }
   //Chia hai phân số
   public PhanSo Chia(PhanSo p1, PhanSo p2){
       PhanSo p3=new PhanSo();
       p3.Tu=this.Tu*p2.Mau;
       p3.Mau=p2.Mau*this.Tu;
       p3.RutGon();
       return p3;
   }
   //So sánh hai phân số
   public boolean equals(Object obj){
       if (this == obj) return true;
       if (obj instanceof PhanSo){
           PhanSo p1= (PhanSo) obj;
           return (this.Tu*p1.Mau==this.Mau*p1.Tu);
       }
       
       return false;
   }
   // Hàm main
   public static void main (String[] args){
    PhanSo p= new PhanSo();
    p.NhapPhanSo();
     PhanSo p1= new PhanSo();
    p1.Tu=3;
    p1.Mau=-5;
       System.out.println(p.equals(p1));
   }
}
