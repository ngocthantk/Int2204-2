/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap52;

/**
 *
 * @author Admin
 */
public class main2 {
    public static void main(String[] args){
        
    Shape s = new Shape("tim", true);
    Circle c = new Circle(3);
    Rectangle r = new Rectangle(3,4);
    Square sq = new Square(6);
    
    System.out.println("\nShape:" + s.toString());
    System.out.println("\nCircle:" + c.toString());
    System.out.println("\nRectangle:" + r.toString());
    System.out.println("\nSquare:" + sq.toString());
    }
}
