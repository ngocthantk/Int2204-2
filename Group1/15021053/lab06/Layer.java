package lab06;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nhozx
 */
public class Layer {
    protected ArrayList<Shape> shape;
    
    public Layer(){}
    
    public Layer(ArrayList<Shape> shape){
        this.shape = shape;
    }

    public ArrayList<Shape> getShape() {
        return shape;
    }

    public void setShape(ArrayList<Shape> shape) {
        this.shape = shape;
    }
    
    public void deleteShape(Shape hinh){
        if(hinh instanceof Triangle){
            for(int i = 0;i < shape.size(); i++){
                if(shape.get(i) instanceof Triangle){
                    shape.remove(i);
                    i --;
                } else {
                }
            }
        }
        if(hinh instanceof Circle){
            for(int i = 0;i < shape.size(); i++){
                if(shape.get(i) instanceof Circle){
                    shape.remove(i);
                    i --;
                }
            }
        }
    }
    public void deleteTriangle(){
        Triangle triangle = new Triangle();
        this.deleteShape(triangle);
    }
    public boolean check(){
        for(int i = 0;i < shape.size(); i++){
                if(shape.get(i) instanceof Triangle){
                    return false;
                } 
            }
        return true;
    }
}

