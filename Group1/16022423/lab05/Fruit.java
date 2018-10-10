/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
public class Fruit {
    protected String name;
    protected String color;
    protected float weight;
    protected int cost;
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setWeight(int weight){
        this.weight = weight;
    }
    
    public float getWeight(){
        return weight;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }
    
    public int getCost(){
        return cost;
    }
    
    
}
