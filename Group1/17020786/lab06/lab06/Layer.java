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
public class Layer {
    private List<Shape> shapes;
    Layer(){
        shapes = new LinkedList<>();
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }
    public void removeTriangle(){
        for(Shape var : shapes){
            if(var instanceof Triangle){
                shapes.remove(var);
            }
        }
    }
}
