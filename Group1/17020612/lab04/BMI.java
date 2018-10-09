/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Admin
 */
public class BMI {
    static String tinhchiso(double  a,double  b)
    {   
        double  chiso=a/(b*2);
        if(chiso<18.5){ 
            System.out.println("Thieu can");
            return "Thieu can";}
        else if(chiso>=18.5&&chiso<23) return "Bình thường";
        else if(chiso>=23&&chiso<25) return "Thừa cân";
        else if(chiso>25) return "Béo phì";
        return null;
    }
    
    
}
