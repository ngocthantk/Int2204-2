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
    public static String Bmi(double h, double kg) {
        double bmi = kg/(h*h);
        String s = null;
        if(bmi < 18.5) {
            s = "Thiếu cân";
        }
        if(bmi >= 18.5 && bmi < 23) {
            s = "Bình thường";
        }
        if(bmi >= 23 &&  bmi <= 25) {
            s = "Thừa cân";
        } 
        if(bmi >= 25) {
            s = "Béo phì";
        }
        return s;
    }
    
}
