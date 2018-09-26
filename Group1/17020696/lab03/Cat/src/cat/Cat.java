/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Cat {
    private String name;
    private String color;
    private float height;
    private float weight;
    
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String s){
        color = s;
    }
    
    public float getHeight(){
        return height;
    }
    public void setHeight(float s){
        height = s;
    }
    
    public float getWeight(){
        return weight;
    }
    public void setWeight(float s){
        weight = s;
    }
    
    // Mèo kêu Meo..meo..!
    public void moo(){
        System.out.println("Meo..Meo..!");
    }
    
    public void getInfo(){
        System.out.println("Can nang cua " + this.getName() + " la:" + this.getWeight());
        System.out.println("Chieu cao cua " + this.getName() + " la:" + this.getHeight());
        System.out.println("Mau cua "+ this.getName() + " la:" + this.getColor());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cat c = new Cat();
        c.setColor("black");
        c.setHeight(50);
        c.setWeight(10);
        c.moo();
        c.getInfo();
    }
    
}
