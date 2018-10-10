/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author CCNE
 */
public class Bmi {
    public static String BMI(double ccao,double cnang){
       double bmi = cnang/(ccao*ccao);
       String res = " ";
    if(bmi<18.5)
        {
            res = "Thieu can";
        }
    if((bmi>=18.5)&&(bmi<=23))
        {
             res = "Binh thuong";
        }
    if((bmi>23)&&(bmi<=24.99))
        {
             res = "Thua can";
        }
    if(bmi>24.99)
        {
            res = "Beo";
        }
    return res;
}
}

