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
public class getBMI {
    public static void main(String[] args){
        getBMI bmi = new getBMI();
        System.out.println(bmi.getBmi(1.65, 62));
    }
    public static String getBmi(double h, double w){
        double bmi = w/(h*h);
        if(bmi < 18.5) return "Thieu can";
        else if(18.5<=bmi && bmi<23) return("Binh thuong");
        else if(23<=bmi && bmi<24.99) return("Thua can");
        else if(bmi>=24.99) return("Beo phi");
        return "Thieu can";
    }
}
