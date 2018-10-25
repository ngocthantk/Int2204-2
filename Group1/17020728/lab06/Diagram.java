/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;

/**
 *
 * @author user56
 */
public class Diagram{
     private ArrayList<Layer> layer;
    private Layer circle=new Layer();


    Diagram() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    public Layer getCircle() {
        return circle;
    }

    public void setCircle(Layer circle) {
        this.circle = circle;
    }
    
    private Layer square=new Layer();

    public Layer getSquare() {
        return square;
    }

    public void setSquare(Layer square) {
        this.square = square;
    }
    
    public Diagram(ArrayList<Layer> layer){
        this.layer = layer;
    }
    public ArrayList<Layer> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<Layer> layer) {
        this.layer = layer;
    }
    
    public void deleteCircle(){
        for(int i = 0; i < layer.size();i++){
            for(int j = 0;j < layer.get(i).getShape().size();j++){
                if(layer.get(i).getShape().get(j) instanceof  Circle){
                layer.get(i).getShape().remove(j);
                
                }
            }
        }
    }
   
}
