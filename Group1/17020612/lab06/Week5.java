/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Collection;

/**
 *
 * @author Admin
 */
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diagram da = new Diagram();
        
        Circle d1 = new Circle();
        Triangle d2 = new Triangle();
        Triangle d3 = new Triangle();
        Triangle d4 = new Triangle();
        Rectangle d5 = new Rectangle();
        Circle d6 = new Circle();
        Triangle d7 = new Triangle();
        Triangle d8 = new Triangle();
        Triangle d9 = new Triangle();
        Rectangle d10 = new Rectangle();
        Circle d11 = new Circle();
        Triangle d12 = new Triangle();
        Triangle d13 = new Triangle();
        Triangle d14 = new Triangle();
        Rectangle d15 = new Rectangle();
        Circle d16 = new Circle();
        Triangle d17 = new Triangle();
        Triangle d18 = new Triangle();
        Triangle d19 = new Triangle();
        Rectangle d20 = new Rectangle();
        Layer d =new Layer();
        d.lop.add(d1);
        d.lop.add(d2);
        d.lop.add(d3);
        d.lop.add(d4); 
        d.lop.add(d5);
        d.lop.add(d6);
        d.lop.add(d7);
        d.lop.add(d8);
        d.lop.add(d9);
        d.lop.add(d10);
        d.lop.add(d11);
        d.lop.add(d12);
        d.lop.add(d13);
        d.lop.add(d14); 
        d.lop.add(d15);
        d.lop.add(d16);
        d.lop.add(d17);
        d.lop.add(d18);
        d.lop.add(d19);
        d.lop.add(d20);

        da.diagram.add(d);
        System.out.println(da.deleteCircle());

       
        System.out.println(d.deleteTriangle());
    }
    
}
