/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Admin
 */
public class mainShape {
    public static void main(String[] args) {
        Shape a=new Shape("do",true);
        System.out.println(a.toString());
        Circle b= new Circle(3.15);
        System.out.println(b.toString());
    }
}
