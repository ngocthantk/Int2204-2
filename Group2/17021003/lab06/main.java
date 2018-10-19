/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author CCNE
 */
public class main {
    public static void main(String[] args) {
        Triangle t= new Triangle(3,4,5);
        Triangle t2= new Triangle(3,7,5);
        
        Circle c = new Circle(5);
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(c);
        shapes.add(t);
        shapes.add(t2);
        System.out.println(shapes.size());
        Layer l = new Layer();
        Diagram d = new Diagram();
        l.deleteAllTriangle(shapes);
        d.deleteAllCircle(shapes);
        System.out.println(shapes.size());
        
        
    }
    
}
