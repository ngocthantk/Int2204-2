/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author Admin
 */
public class bird {

      private String name;
      private String age;
      private String color;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public bird() {
        this.name="PhoenixFire";
        this.age="1";
        this.color="Red and Yellow";
    }
    
    public void sound()
    {
        System.out.println("Chiu chiu");
    }
    
}
