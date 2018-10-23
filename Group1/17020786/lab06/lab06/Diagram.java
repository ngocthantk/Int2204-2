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
public class Diagram {
    private List<Layer> layers;
    public Diagram(){
        layers = new LinkedList<>();
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }
    public void removeCircle(){
        for(Layer v1 : layers){
            List<Shape> shapes = v1.getShapes();
            for(Shape v2: shapes){
                if(v2 instanceof Circle){
                    shapes.remove(v2);
                }
            }
            v1.setShapes(shapes);
        }
    }
}
