/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.*;

/**
 *
 * @author CCNE
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diagram d = new Diagram();
        List<Layer> layers = new LinkedList<>();
        Layer l = new Layer();
        //
        List<Shape> shapes = new LinkedList<>();
        Shape s1 = new Circle();
        Shape s2 = new Triangle();
        shapes.add(s1);
        shapes.add(s2);
        //
        l.setShapes(shapes);
        layers.add(l);
        d.setLayers(layers);
        for(Layer v1 : d.getLayers()){
            List<Shape> s = v1.getShapes();
            for(Shape v2: s){
                System.out.println(v2);
            }
        }
        d.removeCircle();
        for(Layer v1 : d.getLayers()){
            List<Shape> s = v1.getShapes();
            for(Shape v2: s){
                if(v2 instanceof Circle){
                    System.out.println("tron");
                }
                System.out.println("meo");
            }
        }
        /*
        resufl: 
        lab06.Circle@15db9742
        lab06.Triangle@6d06d69c
        meo
        
        =>> success!!
        */
    }
    
}
