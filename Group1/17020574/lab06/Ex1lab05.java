/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1lab05;

/**
 *
 * @author Dat Anh
 */
public class Ex1lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Shape a2 = new Rectangle(1, 2, 3, 4, true, true, "r");
        Shape b2 = new Rectangle(1, 2, 4, 5, true, true, "r");
        Shape c2 = new Rectangle(1, 2, 3, 4, true, true, "r");
        Shape d2 = new Square(1, 3, 4, true, true, "s");
        Shape e2 = new Circle (1, 2, 3, true, true, "c");
        Shape f2 = new Rectangle(1, 2, 3, 4, true, true, "r");
        Shape g2 = new Triangle(1, 2, 3, 4, 5, true, true, "t");
        
        Layer x2 = new Layer();
        Diagram dia2 = new Diagram();
        dia2.addLayer(x2);
        x2.addShape(a2);
        x2.addShape(c2);

        
        dia2.printLayer();
        System.out.println();

        dia2.printLayer();
        System.out.println();
        dia2.arrangeLayer();
        dia2.printLayer();        
        
    }
    
}
