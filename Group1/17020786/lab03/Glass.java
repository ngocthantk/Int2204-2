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
public class Glass {
    private double height;
    private double weight;
    Glass(){
        height = 0;
        weight = 0;
    }

    public double getHeight(){
        return height;
    }    
    public double getWeight(){
        return weight;
    }
    public void setHeight(double h){
        this.height = h;
    }    
    public void setWeight(double w){
        this.weight = w;
    } 
}
