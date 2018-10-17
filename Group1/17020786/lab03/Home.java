/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03.Ex3;

/**
 *
 * @author CCNE
 */
public class Home {
    private String adress;
    private double height;

    Home(){
        adress = "123";
        height = 0;       
    }
    public String getAdress(){
        return adress;
    }
    public double getHeight(){
        return height;
    }    

    public void setAdress(String adress){
        this.adress = adress;
    }
    public void setHeight(double h){
        this.height = h;
    }    

}
