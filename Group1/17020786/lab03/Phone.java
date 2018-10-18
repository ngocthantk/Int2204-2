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
public class Phone {
    private String manufacturer;
    private double inch;
    private double weight;
    private int age;
    Phone(){
        manufacturer = "samsung";
        inch = 1;
        weight = 1;
        age = 1;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public double getInch(){
        return inch;
    }    
    public double getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setInch(double h){
        this.inch = h;
    }    
    public void setWeight(double w){
        this.weight = w;
    }
    public void setAge(int a){
        this.age = a;
    }    
    ///
    public void Ring(){
        System.out.print("ten tènnten!!!!");
    }
}
