/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

public class BMI {
    private double h;
    private double w;
    public BMI(double h, double w){
        this.h=h;
        this.w=w;
    }
    public double getW(){
        return this.w;
    }
    public double getH(){
        return this.h;
    }
    public static String chisoBMI(BMI b){
        String s="";
        double x=b.getW()/(b.getH()*b.getH());
        if(x<=18.5){
            s="Thieu can";
        }
        if(x>18.5&&x<=23){
            s="Binh thuong";
        }
        if(x>23&&x<=25){
            s="Thua can";
        }
        if(x>25){
            s="Beo phi";
        }
        return s;
    }
    
}
