/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;

import java.util.*;
public class PS {

    private int tuso,mauso;
    
    public int getTuso()
    {
        return tuso;
    }
    public void setTuso(int tuso)
    {
        this.tuso = tuso;
    }
    public int getMauso()
    {
        return mauso;
    }
    public void setMauso(int mauso)
    {
        this.mauso = mauso;
    }
    public void congphanso(PS phanso1,PS phanso2)
    {
        PS phanso = new PS();
	phanso.setTuso(phanso1.getTuso()*phanso2.getMauso() + phanso2.getTuso()*phanso1.getMauso());
	 phanso.setMauso(phanso1.getMauso()*phanso2.getMauso()); 
	System.out.println("tổng 2 phân số " + phanso.getTuso() + "\\" + phanso.getMauso());
    }
    public void truphanso(PS phanso1,PS phanso2)
    {
        PS phanso = new PS();
	phanso.setTuso(phanso1.getTuso()*phanso2.getMauso() - phanso2.getTuso()*phanso1.getMauso());
	 phanso.setMauso(phanso1.getMauso()*phanso2.getMauso()); 
	System.out.println("hiệu 2 phân số " + phanso.getTuso() + "\\" + phanso.getMauso());
    }
    public void nhanphanso(PS phanso1,PS phanso2)
    {
        PS phanso = new PS();
	phanso.setTuso(phanso1.getTuso()*phanso2.getTuso());
	 phanso.setMauso(phanso1.getMauso()*phanso2.getMauso()); 
	System.out.println("tích 2 phân số " + phanso.getTuso() + "\\" + phanso.getMauso());
    }
    public void chiaphanso(PS phanso1,PS phanso2)
    {
        PS phanso = new PS();
	phanso.setTuso(phanso1.getTuso()*phanso1.getMauso());
	 phanso.setMauso(phanso1.getMauso()*phanso2.getTuso()); 
	System.out.println("thương 2 phân số " + phanso.getTuso() + "\\" + phanso.getMauso());
    }
    public boolean equals (Object obj)
    {
        if(this == obj) return true;
           if( obj instanceof PS){
               PS ps1 = (PS) obj;
               return (ps1.tuso*this.mauso==ps1.mauso*this.tuso);
           }
               else 
                    return false;
           
    }
    
    public static void main(String[] args) {
       
       PS ps1 = new PS();
       ps1.tuso=-3;
       ps1.mauso=5;
       PS ps2 = new PS();
       ps2.tuso=3;
       ps2.mauso=-5;
       PS ps3 = new PS();
       ps3.congphanso(ps1,ps2);
       ps3.truphanso(ps1,ps2);
       ps3.nhanphanso(ps1, ps2);
       ps3.chiaphanso(ps1,ps2);
       System.out.println(ps1.equals(ps2));
        
                
    }
    
}
