/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Ba Duc
 */
public class Layer{
    private ArrayList<Shape> shape = new ArrayList<>();
    private boolean visible = false;
    
    public Layer(){}
    public Layer(ArrayList<Shape> shape,boolean visible){
        this.shape = shape;
        this.visible = visible;
    }
    
    public Layer(ArrayList<Shape> shape){
        this.shape = shape;
    }

    public ArrayList<Shape> getShape() {
        return shape;
    }

    public void setShape(ArrayList<Shape> shape) {
        this.shape = shape;
    }
    
    public void deleteTriangle(){
        for(int i = 0; i < shape.size();i++){
            if(shape.get(i) instanceof  Triangle){
                shape.remove(i);
                i--;
            }
        }
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void deletesame(){//delete duoc dat trong layer
        for (int i = 0; i < shape.size()-1; i++) {
            for (int j = i+1; j < shape.size(); j++){
                if(shape.get(i)==shape.get(j)){
                    shape.remove(j);
                    j--;
                }
            }
        }
    }
    
}
