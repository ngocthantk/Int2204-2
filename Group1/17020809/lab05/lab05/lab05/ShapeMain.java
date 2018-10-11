<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class ShapeMain {
    public static void main(String[] args){
        Shape s = new Shape("red", true);
        System.out.println(s.getColor());
        System.out.println(s.isFilled());
        //
        Circle c = new Circle(2.5,"red",true);
        System.out.println(c.getRadius());
        System.out.println(c.getColor());
        System.out.println(c.isFilled());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        //
        Rectangle r = new Rectangle(1.0,1.0,"red",true);
        System.out.println(r.getWidth());
        System.out.println(r.getLength());
        System.out.println(r.getColor());
        System.out.println(r.isFilled());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class ShapeMain {
    public static void main(String[] args){
        Shape s = new Shape("red", true);
        System.out.println(s.getColor());
        System.out.println(s.isFilled());
        //
        Circle c = new Circle(2.5,"red",true);
        System.out.println(c.getRadius());
        System.out.println(c.getColor());
        System.out.println(c.isFilled());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        //
        Rectangle r = new Rectangle(1.0,1.0,"red",true);
        System.out.println(r.getWidth());
        System.out.println(r.getLength());
        System.out.println(r.getColor());
        System.out.println(r.isFilled());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
>>>>>>> 8698251a186993be093e172d03823408519eb608
