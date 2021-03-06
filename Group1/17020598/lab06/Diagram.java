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
public class Diagram {
    ArrayList<Layer> layer;
    public Diagram(){
        layer = new ArrayList<>();
    }
    public void addLayer(Layer l){
        this.layer.add(l);
    }
    public void printLayer(){
        int n = layer.size();
        for(int i = 0; i < n; i++)
        {
            layer.get(i).printShape();
        }
    }
    public void delRectangle(){
        int n = layer.size();
        for(int i = 0; i < n; i++)
        {
            layer.get(i).deleteRectangle();
//            n--;
        }
    }
    public void delCircle(){
        for(int i = 0; i < layer.size(); i++)
        {
            layer.get(i).deleteCircle();
        }
    }
   
    public void arrangeLayer(){
        Layer circle = new Layer();
        Layer rectangle = new Layer();
        Layer triangle = new Layer();
        int n = layer.size();
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < layer.get(i).shape.size(); ++j){
                if(layer.get(i).shape.get(j) instanceof Circle)
                    circle.addShape(layer.get(i).shape.get(j));
                else if(layer.get(i).shape.get(j) instanceof Rectangle)
                    rectangle.addShape(layer.get(i).shape.get(j));
                else if(layer.get(i).shape.get(j) instanceof Triangle)
                    triangle.addShape(layer.get(i).shape.get(j));        
            }
        }
        layer.add(circle);
        layer.add(rectangle);
        layer.add(triangle);
    }
}
