/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticjunit;

/**
 *
 * @author MyPC
 */
public class BMI {
    static public String indexBMI(double m, double h )
    {
        double bmi = m/Math.pow(h, 2);
        if(bmi < 18.5)
           return ("Thieu can");
        if(18.5 <= bmi && bmi <24.99)
            return ("Binh thuong");
        
        if(23 <= bmi && bmi <24.99)
            return ("Thua can");
        if(bmi > 25)
            return ("Beo phi");
        return null;
    }
}
