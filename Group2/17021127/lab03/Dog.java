/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Dog {
    String name;
    String speak;
    String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog() {
        this.speak = "gaugau";
    }

    public String getName() {
        return name;
    }

    public String getSpeak() {
        return speak;
    }

    public String getColor() {
        return color;
    }
    
}
