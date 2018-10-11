/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author FEELSBADMAN
 */

public class BMI {//Bài tập BMI

    public String bmi(float m, float h) {
        float i = m / (h * h);
        String a = null ;
        if (i < 18.5) {
            a = "Thieu can";
        }
        if (i < 22.99 && i >= 18.5) {
            a = "Binh thuong";
        }
        if (i >= 22.99 && i < 24.99) {
            a = "Thua can";
        }
        if (i >= 24.99) {
            a = "Beo phi";
        }
        return a;

    }

}
