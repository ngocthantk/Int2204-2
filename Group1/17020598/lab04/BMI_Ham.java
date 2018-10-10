/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author AnhTam
 */
public class BMI_Ham {
    public static String BMI(double a, double b){
        double bmi = a/(b*b);
        if(bmi<18.5) return ("Thieu can");
        if(bmi>=18.5&&bmi<23) return ("Binh thuong");
        if(bmi>=23&&bmi<25) return ("Thua can");
        if(bmi>=25) return ("Beo phi");
        return null;
    }
    
}
