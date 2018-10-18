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
public class Student {
    private String name;
    private double height;
    private double weight;
    private int age;
    Student(){
        name = "dog";
        height = 1;
        weight = 1;
        age = 1;
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
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(double h){
        this.height = h;
    }    
    public void setWeight(double w){
        this.weight = w;
    }
    public void setAge(int a){
        this.age = a;
    }    
    ///
    public void Chat(){
        System.out.print("Bla!Bla!!Bla!");
    }
}
