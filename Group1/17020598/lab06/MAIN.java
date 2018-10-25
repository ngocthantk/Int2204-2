/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnhTam
 */
public class MAIN {
             
        public static void main(String[] args) {
        Shape a1 = new Rectangle(1, 2, 3, 4, true, true, "red");
        Shape a2 = new Rectangle(1, 2, 4, 5, true, true, "red");
        Shape a3 = new Rectangle(1, 2, 3, 4, true, true, "blue");
        Shape b = new Square(1, 3, 4, true, true, "green");
        Shape e = new Circle (1, 2, 3, true, true, "red");
        Shape f = new Rectangle(1, 2, 3, 4, true, true, "blue");
        Shape g = new Triangle(1, 2, 3, 4, 5, true, true, "blue");
        Layer layer = new Layer();
        Diagram diagram = new Diagram();
        diagram.addLayer(layer);
        layer.addShape(b);
        layer.addShape(e);
        layer.addShape(f);
        layer.addShape(g);
        diagram.printLayer();
        System.out.println();
        diagram.printLayer();
        System.out.println();
        diagram.arrangeLayer();
        diagram.printLayer();        
    }
}
