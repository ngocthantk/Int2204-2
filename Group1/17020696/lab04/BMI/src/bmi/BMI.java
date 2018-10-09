/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import static java.lang.Math.pow;

/**
 *
 * @author Nguyen Ba Duc
 */
public class BMI {
   
    
    
    public static String Check(double weight,double height){
        double bmi = weight/ pow(height,2);
        if(bmi < 18.5){
           return "Thiếu cân";
        }
        else if(bmi >= 18.5 && bmi < 23){
            return "Bình thường";
        }
        else if(bmi >= 23 && bmi <24.99){
            return "Thừa cân";
        }
        else{
            return "Béo phì";
        }
   
             
    }

    static Object check(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
