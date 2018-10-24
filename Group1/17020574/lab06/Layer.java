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
import java.util.ArrayList;
public class Layer {
        ArrayList<Shape> shape;

    public Layer() {
        shape = new ArrayList<>();
    }
    
    public void addShape(Shape s){
        this.shape.add(s);
    }
    
    public void deleteRectangle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i) instanceof Rectangle){
                shape.remove(i);
                --i;
            }
        }
    }
    
    public void deleteCircle(){
        for(int i = 0; i < shape.size(); ++i){
            if(shape.get(i) instanceof Circle){
                shape.remove(i);
                --i;
            }
        }
    }
    
    public void deleteDuplicateShape(){
        ArrayList<Shape> s = new ArrayList<>();
        for(Shape temp : shape){
            if(!s.contains(temp)){
                s.add(temp);
            }
        }
        shape = s;
    }
    
    public void printShape(){
        for (int i = 0; i < shape.size(); ++i){
            if (shape.get(i).isVisible())
                System.out.println(shape.get(i).toString());
        }
    }
    
}
