/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Person {
    private String name;
    private int old;
    private float height;
    private float weight;
    
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    
    public int getOld(){
        return old;
    }
    public void setOld(int s){
        old = s;
    }
    
    public float getHeight(){
        return height;
    }
    public void setHeight(float s){
        height = s;
    }
    
    public void setWeight(float s){
        weight = s;
    }
    public float getWeight(){
        return weight;
    }
    
    void getInfo(){
        System.out.println("Ten cua ban la: " + this.getName());
        System.out.println("Chao " + this.getName() + ", Sau day la mot so thong tin cua ban: ");
        System.out.println("Tuoi : " + this.getOld());
        System.out.println("Chieu cao : " + this.getHeight());
        System.out.println("Can nang : " + this.getWeight());
    }
    
    public static void main(String[] args){
        Person p = new Person();
        p.getInfo();
    }
}
