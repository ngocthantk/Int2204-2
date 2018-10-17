/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author nguyen
 */
public class Test {
    public static void  main(String [] args){
        Shape shape = new Shape();
        Circle circle = new Circle(4.0,"red",true);
        Rectangle rectangle = new Rectangle(3.0,4.0,"red",true);
        Square square = new Square(4.0);
        System.out.println(shape.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        square.setLength(3.0);
        System.out.println(square.toString());
    }
}
