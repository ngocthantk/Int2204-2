/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author AnhTam
 */
public class Layer {
       ArrayList<Shape> shape;

    public Layer() {
        shape = new ArrayList<>();
    }
    
    public void addShape(Shape s){
        this.shape.add(s);
    }
    public void deleteRectangle(){
        int n = shape.size();
        for(int i = 0; i < n; i++){     
                shape.remove(i);
                n--;
        }
    }
    public void deleteCircle(){
        int n = shape.size();
        for(int i = 0; i < n; i++){
                shape.remove(i);
                n--;
        }
    }
    
    
    public void printShape(){
        int n = shape.size();
        for (int i = 0; i < n; ++i){
                System.out.println(shape.get(i).toString());
        }
    }

}
