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
public class Tiger {
    private String name;
    private double height;
    private double weight;
    Tiger(){
        name = "Tiger";
        height = 0;
        weight = 0;
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }    
    public double getWeight(){
        return weight;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(double h){
        this.height = h;
    }    
    public void setWeight(double w){
        this.weight = w;
    }    //
    public void Say(){
        System.out.print("Goal!!  Goal!!");
    }
}
