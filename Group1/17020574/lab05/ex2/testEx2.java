/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Dat Anh
 */
public class testEx2 {
    public static void main(String[] args) {
        
        //TODO code application logic here
        Square a =new Square(15.0,"den",true);
        System.out.println(a.toString());
        Circle b = new Circle(15.0);
        System.out.println(b.toString());
        Rectangle c =new Rectangle(10,15,"do",false);
        System.out.println(c.toString());
        Shape d =new Shape("vang",false);
        System.out.println(d.toString());
    }
    
}
