/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author CCNE
 */
public class BMI {
    public static String FindBMI(double h, double m)
    {
        double BMI = m/(h*h);
        String s = "";
        if(BMI<18.5){
            s = "Thieu can";
        }
        if(BMI>=18.5 && BMI<23){
            s = "Binh thuong";
        }
        if(BMI>=23 && BMI<25){
            s= "Thua can";
        }
        if(BMI>=25){
            s = "Beo phi";    
        }
    return s;
    }
        
    
}
